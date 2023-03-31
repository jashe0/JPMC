public class Main {

    public static void main(String[] args) {


    Employee tim = new Employee("Tim","11/11/1985","01/01/2020");
    HourlyEmployee mary = new HourlyEmployee("Mary","5/5/1970","03/03/2021",15);
    SalariedEmployee joe = new SalariedEmployee("Joe","11/11/1990","03/03/2020",35000);

    System.out.println(tim);
    System.out.println("Age = "+tim.getAge());
    System.out.println("Pay = "+tim.collectPay());

    System.out.println(joe);

    System.out.println("Joe's pay = $"+joe.collectPay());

    joe.retire();
    System.out.println("Joe's pension check = $"+joe.collectPay());

    System.out.println(mary);
    System.out.println("Marys pay = $"+mary.collectPay());
    System.out.println("Marys over time pay = $"+mary.getDoublePay());
    }
}
