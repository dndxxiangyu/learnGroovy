package groovyR.chapter4

def totalSelectValues(n, closure) {
    total = 0;
    for (i in 0..n) {
        if (closure(i)) {
            total += i
        }
    }
    total
}

println "total of even numbers from 1 to 10 is"
/**
 * 将闭包内联到了方法调用中。
 * 在闭包中，最后一行的返回值return也是可选的。
 */
println totalSelectValues(10) {it % 2 == 0}
println totalSelectValues(10, {it % 2 == 0})

def isOdd = { it % 2 != 0 }
println totalSelectValues(10, isOdd)

/**
 * 闭包传递参数
 */
def tellforture(closure) {
    closure new Date("09/20/2012"), "your day is filled with ceremony"
}

tellforture() { date, fortune ->
    println "fortune for ${date} is ${fortune}"
}
dateClosure = { date, fortune ->
    println "fortune for ${date} is ${fortune}"
}
tellforture(dateClosure)
