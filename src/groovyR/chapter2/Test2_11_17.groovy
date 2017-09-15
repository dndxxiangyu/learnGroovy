package groovyR.chapter2

int[] arr = [1,2,3,4,5]
def arr1 = [1,2,3,4,5] //默认创建的是ArrayList
print arr.getClass()
println arr1.getClass()

def arr3 = [1,2,3,4,5] as int[]
