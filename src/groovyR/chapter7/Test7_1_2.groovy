package groovyR.chapter7

lst = [1, 2]
lst.with {
    add(3)
    add(4)
    println size()
    println contains(2)
}

lst.with {
    println "this is ${this}"
    println "owner is ${owner}"
    println "delegate is ${delegate}"
}

println "sss".dump()