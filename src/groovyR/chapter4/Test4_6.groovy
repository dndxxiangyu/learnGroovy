package groovyR.chapter4

def iterate(n, closure) {
    1.upto(n) {
        println "in iterate with value ${it}"
        closure(it)
    }
}

println 'calling iterate'
total = 0
iterate(4) {
    total += it
    println "in closure total so far is ${total}"
}
println "done"


