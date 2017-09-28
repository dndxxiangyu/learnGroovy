package groovyR.chapter9

def sql = groovy.sql.Sql.newInstance("jdbc:mysql://localhost:3306/weather", "root", "root", "com.mysql.jdbc.Driver")
println sql.connection.catalog

println "city | temperature"
sql.eachRow("select * from weatherInfo") {
    println "${it.city} | ${it.temperature}"
}