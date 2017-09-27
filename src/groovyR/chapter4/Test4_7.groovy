package groovyR.chapter4

/**
 * 科里化闭包，对一个闭包调用curry时，就是要求预先绑定某些形参
 * 然后在调用闭包的时候就不用重复传入实参了。
 * @param closure
 * @return
 */
def tellFortunes(closure) {
    Date date = new Date("09/20/2012")
    //closure date, "your day is filled with ceremony"
    //closure date, "they're features, not bugs"
//    String a = "dfdsfdfdsfds"//只能绑定前面开始的若干个
    //如果想科里化后面的形参，可以使用rcurry方法
    //如果想科里化位于形参列表终结的形参，可以使用ncurry方法。需要提供位置。
    postFortune = closure.curry(date)
    postFortune "your day is filled with ceremony"
    postFortune "the're features, not bugs"
}
tellFortunes() { date, fortune ->
    println "fortune for ${date} is '${fortune}'"
}