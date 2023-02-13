package Person;

public class Builder extends  Person {
    public Builder() {
    }
    @Override
    void work(){
        System.out.println("Building");
    }
}
