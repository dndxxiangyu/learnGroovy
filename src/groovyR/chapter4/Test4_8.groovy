package groovyR.chapter4

/**
 * 动态闭包：如果未提供闭包，就是用默认的。
 * @param closure
 * @return
 */
def doSomething(closure) {
    if (closure) {
        closure()
    } else {
        println "using default implementation"
    }
}

doSomething({ println "use specialized implementation" })
doSomething() {
    println "use specialized implementation"
}

doSomething()


def examine(closure) {
    println "$closure.maximumNumberOfParameters parameter(s) given:"
    for (aParameter in closure.parameterTypes) {
        println aParameter.name
        println "--\r\n"
    }
}

examine() {}
examine() { it }
examine() { -> }
examine() { vall -> }
examine() { Date vall -> }