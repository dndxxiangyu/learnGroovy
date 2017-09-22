package groovyR.chapter2

int[] arr = [1,2,3,4,5]
def arr1 = [1,2,3,4,5] //默认创建的是ArrayList
println arr.getClass()
println arr[2]
println arr1.getClass()
println arr1.get(2)
def arr3 = [1,2,3,4,5] as int[]

closureA = {
    a = 10;
    b = 11;
    a + b;
}
println closureA()

//闭包参数
def toTriple = { n ->
    n * n
}
println toTriple(10)

closureB = {
    println 'closureB'
}
closureB