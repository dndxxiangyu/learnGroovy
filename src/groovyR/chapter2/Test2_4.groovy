package groovyR.chapter2

def log(x, base = 10) {
    10
}

def task(name, String[] details) {
    println "$name, $details"
}
println log(1,a:1, b:2)

task("wxy", "1,2,2","xxxx")