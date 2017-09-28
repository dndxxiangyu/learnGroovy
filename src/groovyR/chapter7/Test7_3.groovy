package groovyR.chapter7
/**
 * 扩展模块定制方法
 */
def url = "http://hq.sinajs.cn/list=sh601006".toURL()

println url.readLines("gbk")[0].split(",")[3]