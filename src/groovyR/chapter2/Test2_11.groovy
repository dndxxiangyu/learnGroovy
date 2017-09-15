package groovyR.chapter2
//groovy 的 == 等价于java的equals
// groovy中比较对象的引用是否相等，需要使用is()方法。

//如果该类继承了Comparable，则== 等价于compareTo方法。
str1 = "hello"
str2 = str1
str3 = new String("hello")
str4 = "hello"

println "str1 == str2 : ${str1 == str2}"
println "str1 == str3 : ${str1 == str3}"
println "str1 == str4 : ${str1 == str4}"
println "str1.is(str2) : ${str1.is(str2)}"
println "str1.is(str3) : ${str1.is(str3)}"
println "str1.is(str4) : ${str1.is(str4)}"

class A {
    @Override
    boolean equals(Object obj) {
        println "equals called"
        false
    }
}

class B implements Comparable {

    @Override
    int compareTo(Object o) {
        println "compareto called"
        0
    }

    @Override
    boolean equals(Object obj) {
        println "equals called"
        false
    }
}

new A() == new A();
new B() == new B();