package groovyR.chapter2

class Test2_7 {
    public static void main(String[] args) {
        MyBoolean myBoolean = new MyBoolean()
        if (myBoolean) {
            println "custom the boolean value"
        }
    }
}
//自定义类实现在if中判断是否为true或者false
class MyBoolean {
    public boolean asBoolean() {
        return true;
    }
}