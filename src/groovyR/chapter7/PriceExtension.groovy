package groovyR.chapter7

class PriceExtension {
    /**
     * 该方法被定义为static
     * 第一个参数说明该方法被添加在哪个类上。
     * 这段代码并没有说出要添加的这个方法是实例方法还是静态方法，这个信息需要放在清单中。
     */
    public static double getPrice(String self) {
        def url = "http://hq.sinajs.cn/list=$self".toURL()
        def data = url.readLines()[0].split(",")
        Double.parseDouble(data[3])
    }

}
