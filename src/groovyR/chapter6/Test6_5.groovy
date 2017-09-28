package groovyR.chapter6

//map
langs = ['C++': 'StrouStrup', "Java" : 'Gosling', "Lisp": "McCarthy"]
println langs.getClass().name//LinkedHashMap
println langs['Java']
println langs.Java
//println langs.C++ //++冲突了
println langs.'C++'

langs.each {entry ->
    println "key: $entry.key ; value: $entry.value"
}
