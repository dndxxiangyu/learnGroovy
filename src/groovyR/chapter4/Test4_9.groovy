package groovyR.chapter4
/**
 *  闭包委托
 */
def examningClosure(closure) {
    closure()
}

def test() {
    println "test method"
}

/**
 *
 * in first closure:
 class is groovyR.chapter4.Test4_9$_run_closure1
 this is groovyR.chapter4.Test4_9@3f197a46, super: groovy.lang.Script
 owner is groovyR.chapter4.Test4_9@3f197a46, super: groovy.lang.Script
 delegate is groovyR.chapter4.Test4_9@3f197a46, super: groovy.lang.Script

 in closure within the first closure:
 class is groovyR.chapter4.Test4_9$_run_closure1$_closure2
 this is groovyR.chapter4.Test4_9@3f197a46, super: groovy.lang.Script
 owner is groovyR.chapter4.Test4_9$_run_closure1@4facf68f, super: groovy.lang.Closure
 delegate is groovyR.chapter4.Test4_9$_run_closure1@4facf68f, super: groovy.lang.Closure
 */


/**
 * 一般delegate会设置为owner
 * 闭包会被创建为内部类，
 * 闭包中的this指向的是该闭包所绑定的对象，表示这个script对象。
 */
examningClosure() {
    println "in first closure:"
    println "class is " + getClass().name
    println "this is " + this + ", super: " + this.getClass().superclass.name;
    println "owner is " + owner + ", super: " + owner.getClass().superclass.name;
    println "delegate is " + delegate + ", super: " + delegate.getClass().superclass.name;

    examningClosure() {
        println "in closure within the first closure:"
        println "class is " + getClass().name
        println "this is " + this + ", super: " + this.class.superclass.name
        println "owner is " + owner + ", super: " + owner.getClass().superclass.name
        println "delegate is " + delegate + ", super: " + delegate.getClass().superclass.name
    }
}


class Handler {
    String handlerName;
    Handler(name) {
        handlerName = name
    }
    def f1() {
        println handlerName + "f1 of Handler called..."
    }
    def f2() {
        println handlerName + "f2 of handler called..."
    }
}
class Example {
    def f1() {
        println "f1 of Example called...."
    }
    def f2() {
        println "f2 of Example called..."
    }

    def foo(closure) {
        //如果不设置delefate，则通过this，会找不到调用的f1、f2方法。
        closure.delegate = new Handler("delegate ")
//        closure.this = new Handler("this")
//        closure.owner = new Handler("owner")
        closure()
    }
}
new Example().foo() {
    f1()
    f2()
}