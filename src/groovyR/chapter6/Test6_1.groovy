package groovyR.chapter6

lst = [1, 3, 4, 5, 6, 7]
println lst.getClass().name
println lst.subList(1, 4).getClass()

lst.each {
    print it + " "
}
str = "cccc"
str.each {
    print it + " "
}

total = 0
lst.each() {
    total += it
}
println "Total is ${total}"

// <<：映射到leftShift方法，将得到的值放到结果中
doubled = []
lst.each() {
    doubled << it * 2
}
println doubled

println lst.collect() { it * 2 }

println lst.find { it == 1 }
println lst.find { it > 5 }
println lst.findAll {it > 6} // return list

lst = ['Programming', 'In', 'Groovy']
println lst.join(" ")
println lst
println lst - ['Programming', 'In', 'DDDD']

println lst.size()
println lst*.size()