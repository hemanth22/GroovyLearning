// https://mvnrepository.com/artifact/mysql/mysql-connector-java
@Grapes(
    @Grab(group='mysql', module='mysql-connector-java', version='5.1.13')
)
import groovy.sql.Sql
def sql = Sql.newInstance("jdbc:mysql://localhost:3306/gps","username","password","com.mysql.jdbc.Driver")

def routepoints = sql.dataSet("routepoints")
routepoints.add(column_name: functionwhichhasvalue)

sql.eachRow('select * from table_name') {
    println "column_name: ${it.column_name}"
}

def row = sql.firstRow('select * from table_name') {
    println "column_name: ${it.column_name}"
}

def newvalue = 100
sql.executeUpdate("update tablename set column_name = ${newvalue}");
sql.close()
