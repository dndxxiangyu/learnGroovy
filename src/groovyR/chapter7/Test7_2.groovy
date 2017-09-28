package groovyR.chapter7

int[] arr = [1, 2, 3, 4, 5, 6]
println arr[2..4]

String[] command = ['cmd', '/c', 'groovy', '-e', '"print \'groovy\'"']
println "calling ${command.join(' ')}"
println command.execute().text