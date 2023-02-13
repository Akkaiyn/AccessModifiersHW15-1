package Person;

public class Person {
    private final String name= "Adilet";
     private static int age;

    public Person() {
    }

    void work(){
        System.out.println("Working");
    }

    public String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Person.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
