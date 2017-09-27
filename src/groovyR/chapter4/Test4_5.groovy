package groovyR.chapter4

writer = new FileWriter('output.txt')
writer.write("!")

/**
 * 闭包进行资源清理
 */
new FileWriter("output.txt").withWriter (){
    writer -> writer.write("a")
}
new FileWriter("output.txt").withWriter {
    writer -> writer.write("a")
}