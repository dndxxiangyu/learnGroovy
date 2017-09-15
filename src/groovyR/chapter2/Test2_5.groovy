package groovyR.chapter2

def splitName(fullName) {
    fullName.split(" ")
}
(firstName, lastName) = splitName("wu xiangyu cc")
println "$firstName, $lastName"

def name1 = "name1"
def name2 = "name2"
(name1, name2) = [name2, name1]
println "name1:$name1, name2:$name2"

def (String cat, int man) = ["tome", 11, "xccc"]
println "$cat, $man"
