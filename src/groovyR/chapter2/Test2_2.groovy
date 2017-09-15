package groovyR.chapter2
//javabean
public class Test {
    public static void main(String[] args) {
        CarJava carJava = new CarJava(2008);
        System.out.println("Year: " + carJava.getYear());
        System.out.println("Miles: " + carJava.getMiles());
        System.out.println("-------------------------");
        CarGroovy carGroovy = new CarGroovy(2000)
//        carGroovy.year = 2001;
//        carGroovy.miles = 10
        println "Year: $carGroovy.year"
        println "Miles: $carGroovy.miles"
        System.out.println("-------------------------");
        println Map.class.name
    }
}

class CarJava {
    private int miles;
    private final int year;

    public CarJava(int theYear) {
        year = theYear;
    }

    int getMiles() {
        return miles;
    }

    void setMiles(int miles) {
        this.miles = miles;
    }

    int getYear() {
        return year;
    }
}
//可以把字段标记为private，但是groovy的实现不区分public、private、protected。
class CarGroovy {
    //注意：访问类属性，都是通过访问器来实现的。
    private def miles = 0
    final year
    private CarGroovy(theYear) {
        year = theYear
        miles = 100;
    }

    //如果要设置一个属性为私有的，通过private是不行的，只能通过人为的设置更改器
    private void setMiles(miles) {
        throw new IllegalAccessException("not allowed change miles")
    }
    //允许在类内部修改miles
    def drive(dist) {
        if (dist > 0) {
            miles += dist;
        }
    }
}