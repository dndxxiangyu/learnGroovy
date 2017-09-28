package groovyR.chapter7

class Car{
    int miles, fuelLevel
}
car = new Car(miles: 1, fuelLevel: 1)
propertie = ['miles', 'fuelLevel']
propertie.each { name ->
    println "$name = ${car[name]}"
}

class Person {
    def walk() {
        println "Walking...."
    }

    def walk(int miles) {
        println "Walking $miles miles...."
    }

    def walk(int miles, String where) {
        println "Walking $miles miles $where"
    }
}

a = [2, 'upadd']
person = new Person()
//groovyobject method
person.invokeMethod("walk", null)
person.invokeMethod("walk", 10)
person.invokeMethod("walk", [2, 'uphill'])

person.getMetaClass().invokeMethod()

