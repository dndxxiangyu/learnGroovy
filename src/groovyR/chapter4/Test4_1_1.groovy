package groovyR.chapter4


def sum(n) {
    total = 0;
    for (int i = 2; i <= n; i += 2) {
        total  += i;
    }
    total
}

println "sume of even numbers from 1 to 10 is ${sum(10)}"


