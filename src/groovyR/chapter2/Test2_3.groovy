package groovyR.chapter2

class Robot {
    def type, height, width
//    Robot(a) {
//        type =a
//    }
    def access(location, width, fragile) {
        println "Received fragile?$fragile, width: $width, loc: $location"
    }
}

robot = new Robot(type: "arm", width: 10, height: 40)
robot = new Robot(type: "arm", width: 10)
println "$robot.type, $robot.width, $robot.height"
robot.access(x:1, y:2, 2, true)
robot.access(1, 2, true)
robot.access(50, true, x:30, y:20)
robot.access(50, x:30, y:20,true)

//access方法有3个形参，如果第一个是map，则可以将这个映射中的键值对展开放在实例列表中，
//groovy编译器为我们创建了灵活的构造器，如果发送的实参的个数多于方法的形参的个数，而且多出的实参是名值对，那么groovy会假设方法的第一个形参是一个map。
//然后将形参列表中的所有名值对组织到一起，作为第一个形参的值。之后再将剩下的实参安装给出的顺序付给其余形参。
