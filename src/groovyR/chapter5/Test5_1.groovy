package groovyR.chapter5


println 'he said, "that is Groovy"'
str = 'a String'
println str.getClass().name

value = 25
println 'The value is ${25}'

str = "hello"
println str[2]
try {
    str[2] = '!'
} catch (ex) {
    println ex
}

what = new StringBuilder('fence')
text = "the cow jumped over $what"

def getStringClass(str) {
    println str.class.name
}
val = 25
getStringClass("the stock closed at $val")//GStringImpl
getStringClass('the stock closed at $val')

str = "It's a rainy day in Seattle rainy ccc"
println str
//只删除第一个匹配字符串
str -= 'rainyd '
println str

for (str in 'held'..'helm') {
    println "$str"
}

