package test;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class ReferenceQueueTest {
    private static ReferenceQueue<Ref> rq = new ReferenceQueue<Ref>();
    private static int _1M = 1024*1024;

    public static void main(String[] args) throws InterruptedException {
        Object value = new Object();
        Map<Object, Object> map = new HashMap<>();
        Thread thread = new Thread(() -> {
            try {
                int cnt = 0;
                WeakReference<Ref> k;
                while((k = (WeakReference) rq.remove()) != null) {
                    k.get().test();
                    System.out.println((cnt++) + "回收了:" + k);
                }
            } catch(InterruptedException e) {
                //结束循环
            }
        });
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(500);
        for(int i = 0;i < 10000;i++) {
            Ref ref = new Ref();
            WeakReference<Ref> weakReference = new WeakReference<Ref>(ref, rq);
            map.put(weakReference, value);
        }
        System.out.println("map.size->" + map.size());
    }

}

class Ref {
    byte[] b = new byte[1024*1024];
    public Ref() {
//        System.out.println("ref constructor");
    }

    public void test() {
        System.out.println("ref method test");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("ref method finalize");
        super.finalize();
    }
}
