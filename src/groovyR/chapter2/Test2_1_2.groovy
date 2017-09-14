package groovyR.chapter2

//groovy的迭代方式：
println "0..2----------------------"
for (i in 0..2) {
    print i
}
// upto方法,it代表循环时候的索引值
println "\r\nupto------------------------"
1.upto(3) {
    print"$it "
}

// times,如果分为从0开始，则upto直接可以使用times代替
println "\r\ntimes------------------------"
3.times {
    print "$it "
}

//循环的时候跳过一些值

println "\r\nstep------------------------"
1.step(10, 2) {
    print "$it "
}