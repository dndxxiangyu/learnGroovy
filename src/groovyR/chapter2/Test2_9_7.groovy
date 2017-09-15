package groovyR.chapter2

//groovy对于泛型，不要期望groovy编译器会帮我们拒绝违规代码。
public class Test2_9_7 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add("cc1")
        arr.add(1.0f)
        arr.add(10);
        //不强转element的时候，是不会有问题的。
        for (element in arr) {
            println element.class
        }

        //强转为int的时候会失败
        for (int element in arr) {
            println element.class
        }
    }
}