package week14;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name,int age,char gender ){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

/*
Student Task Requirements:
1. Create a class named "Person" with the following specifications:
   Attributes:
       - name: String
       - age: int
       - gender: char

   Constructor:
          - Add a constructor that can set all the fields when the Person class is created.

   Encapsulation:
       - Encapsulate all the fields.

   Actions:
       - toString(): Prints the information of the Person object.
 */