package groovyR.chapter7

class PriceStaticExtension {

    /**
     * 第一个参数表示该方法要用到哪个类上
     * 第二个是实际的股票价值，说明要获取那只股票的价格。
     */
    public static double getPrice(String selfType, String ticker) {
        def url = "http://hq.sinajs.cn/list=$ticker".toURL()
        def data = url.readLines()[0].split(",")
        Double.parseDouble(data[3])
    }
}
