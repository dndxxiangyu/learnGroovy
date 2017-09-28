package groovyR.chapter7

//groovy中Object的sleep居然忽略了中断
thread = Thread.start {
    println 'Thread started'
    startTime = System.nanoTime()
//    Thread.sleep(1000)
    new Object().sleep(2000) {
        println "interrupted: + ${it}"
    }
    endTime = System.nanoTime()
    println "Thread done in ${(endTime - startTime)}"
}
new Object().sleep(100)
println "Let's interrupt that thread"
thread.interrupt()
thread.join()

Thread thread1 = new Thread();
thread1.start{
    println "thread1-------------"
}