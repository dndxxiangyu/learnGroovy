package groovyR.chapter2

//异常处理
try {
    Thread.sleep(1 * 1000)
} catch (Exception e) {
    println e
}
//groovy对那些不想处理，或者不适合在代码的当前层次处理的异常，groovy并不强制我们处理。
//就像上面的sleep一样，不加try catch也是正常的。
//我们不处理的任何异常，都会被自动传递给更高的一层。
def openFile(fileName) {
    new FileInputStream(fileName)
}

openFile("D://test1.txt")

try {
    openFile("D://test.txt")
} catch (ex) {
    print ex
}