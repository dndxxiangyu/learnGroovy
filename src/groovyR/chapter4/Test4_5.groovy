package groovyR.chapter4

writer = new FileWriter('output.txt')
writer.write("!")

/**
 * 闭包进行资源清理
 */
new FileWriter("output.txt").withWriter() {
    writer -> writer.write("a")
}
new FileWriter("output.txt").withWriter {
    writer -> writer.write("a")
}

/**
 * 在任何实例调用之前先调用open，完成时在调用close
 */
class Resource {
    def open() {
        println "opened..."
    }

    def close() {
        println "closed"
    }

    def read() {
        println "read...."
    }

    def write() {
        println "write..."
    }
    /**
     * 这个静态方法，
     * @param closure
     * @return
     */
    def static use(closure) {
        def r = new Resource();
        try {
            r.open()
            closure(r)
        } finally {
            r.close()
        }
    }
}

def resource = new Resource()
resource.open()
resource.read()
resource.write()// forgot close


Resource.use { res ->
    res.read()
    res.write()
}