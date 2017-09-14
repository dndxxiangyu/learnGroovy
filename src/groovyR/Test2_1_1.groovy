package groovyR

// 1. 去掉main和类定义，这样就变成了一个srcipt了
//class Test2_1_1 {
//    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("ho ");
        }
        System.out.print("Merry Groovy!");
//    }
//}

//2. 实现效果和上面的一致
for (i in 0..2) {
    print "ho"
}
print 'Merry Groovy!'
