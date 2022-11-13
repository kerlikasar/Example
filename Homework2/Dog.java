package Homework2;

import java.lang.invoke.CallSite;
import java.util.List;

public class Dog {
    private String name;
    private String type;
    private Integer age;
    private List<String> toys;

    protected Dog(final String name, final String type, final Integer age, final List<String> toys) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.toys = toys;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType() {
        this.type = type;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(java.lang.Integer age) {
        this.age = age;
    }

    public List<String> getToys() {
        return toys;
    }

    public void setToys(List<String> toys) {
        this.toys = toys;
    }

    public static class Builder {
        private String name;
        private String type;
        private Integer age;
        private List<String> toys;


        public Builder withName(final String name) {
            this.name = name;
            return this;
        }

        public Builder withType(final String type) {
            this.type = type;
            return this;
        }

        public Builder withAge(final Integer age) {
            this.age = age;
            return this;
        }

        public Builder withToys(final List<String> toys) {
            this.toys = toys;
            return this;
        }

        public Dog build() {
            return new Dog(name, type, age, toys);
        }
    }
}
