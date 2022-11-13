package Homework2;

public class BuilderDemo {
    public static void main(String[] args){
        Dog dog = new Dog.Builder()
                .name("Professor")
                .type("Beagle")
                .age(2)
                .toys("ball")
                .build();
        System.out.println(dog);

    }

}
