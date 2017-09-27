package groovyR.chapter3


class Man {
    void helpMoveThings() {
        println "man's helping"
    }
}

class Elephant {
    void helpMoveThings() {
        println "element's helping"
    }
}

def takeHelp(help) {
    println help
    help.helpMoveThings()
}

takeHelp(new Man())
takeHelp(new Elephant())
