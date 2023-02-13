
package Person;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        System.out.println(programmer);
        Programmer.setAge(26);
        System.out.println(Programmer.getAge());
        programmer.work();
        System.out.println("*****************************************************************");

        Driver driver = new Driver();
        System.out.println(driver);
        Driver.setAge(32);
        System.out.println(Driver.getAge());
        driver.work();
        System.out.println("*****************************************************************");

        Builder builder = new Builder();
        System.out.println(builder);
        Builder.setAge(35);
        System.out.println(Programmer.getAge());
        builder.work();



    }
}