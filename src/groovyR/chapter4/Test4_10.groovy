package groovyR.chapter4
/**
 * 尾递归：在递归过程中，内存恒定
 */

def factorial(BigInteger number) {
    if (number == 1) {
        1
    } else {
        number * factorial(number - 1)
    }
}

//栈溢出
//println "factorial of 5 is ${factorial(5000)}"

Closure factorial
factorial = { int number, BigInteger theFactorial ->
    number == 1 ? theFactorial :
            factorial.trampoline(number - 1, number * theFactorial)
}.trampoline()

println "factorial of ${factorial(5000, 1)}"