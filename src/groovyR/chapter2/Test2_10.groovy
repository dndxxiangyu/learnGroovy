package groovyR.chapter2

import groovy.transform.Canonical
import groovy.transform.Immutable

//class Test2_10 {
//    public static void main(String[] args) {
//
//    }
//}

@Canonical(excludes = "age")
class Person {
    String firstName
    String lastName
    int age
}
Person person = new Person(firstName: "wu", lastName: "xiangyu", age: 111)
println person.toString()
class Worker {
    def work() {
        println "get work done"
    }
    def analyze() {
        println "analyze....."
    }
    def writeReport() {
        println 'get report written'
    }
}
class Expert {
    def analyze() {
        println "expert analysis..."
    }
}

class Manager {
    //由于顺序先出现，所以会调用expert的analyze方法
    @Delegate
    Expert expert = new Expert()
    @Delegate
    Worker worker = new Worker()

}

def bernie = new Manager()
bernie.analyze()
bernie.work()
bernie.writeReport()

@Immutable
class CreditCard {
    String cardNumber
    int creditLimit
}

println new CreditCard("400-1111-0000-111", 100)

class Heavy {
    def size = 10;
    Heavy() {
        println "creating heavy with $size"
    }
}
class AsNeeded {
    def value
    @Lazy Heavy heavy1 = new Heavy()
    @Lazy Heavy heavy2 = {new Heavy(size: value)}()

    AsNeeded() {
        println "Created AsNeeded"
    }
}
def asNeeded = new AsNeeded(value: 1000)
println asNeeded.heavy1.size
println asNeeded.heavy1.size
println asNeeded.heavy2.size

@Newify([Person, CreditCard])
def fluentCreate() {
    println Person.new(firstName: "wu", lastName: "xiangyu", age: 20)
    println Person(firstName: "wu", lastName: "xiangyu", age: 20)
    println CreditCard("1234-5678-8887-5345345", 2000)
}
fluentCreate()


//会生成静态getInstance方法
@Singleton(lazy = true)
class TheUnique {
//    private TheUnique() {
//        println "instance created"
//    }
    def hello() {
        println "hello" + this
    }
}

TheUnique.instance.hello()
TheUnique.instance.hello()
