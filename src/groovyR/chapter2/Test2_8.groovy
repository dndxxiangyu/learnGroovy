package groovyR.chapter2

/**
 * 重载操作符
 */
class Test2_8 {
    public static void main(String[] args) {
        ComplextNumber num1 = new ComplextNumber(real:10, imageinary: 1)
        ComplextNumber num2 = new ComplextNumber(real:10, imageinary: 2)
        println num1 + num2;
    }
}
class ComplextNumber {
    def real, imageinary

    def plus(other) {
        new ComplextNumber(real: real + other.real, imageinary: imageinary + other.imageinary)
    }

    @Override
    String toString() {
        return "$real${imageinary > 0 ? "+" : "-"}${imageinary}i"
    }
}
