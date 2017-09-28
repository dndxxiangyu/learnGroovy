package groovyR.chapter10

/**
 * java中创建与传递groovy闭包,
 * 闭包就是一个匿名内部类
 *
 */

class AGroovyClass {
    def useClosure(closure) {
        println "calling closure"
        closure()
    }

    def passToClosure(int vlaue, closure) {
        println "simply passing $value to given closure"
        closure(value)
    }
}