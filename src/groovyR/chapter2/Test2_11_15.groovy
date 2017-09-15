package groovyR.chapter2

class Calibrator {
    Calibrator(calculationBlock) {
        println "using....."
        calculationBlock()
    }
}
def testMethod() {
    println "testMethod"
}

def calibrator = new Calibrator({
    println 'ccccccc'
});

def ca = { println "anathor dsfdsfdsfds"}
ca();