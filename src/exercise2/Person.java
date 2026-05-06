package exercise2;
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("[INIT] Person created -> Name: " + name + ", Age: " + age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        System.out.println("[UPDATE] Name changed: " + this.name + " -> " + name);
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("[UPDATE] Age changed: " + this.age + " -> " + age);
        this.age = age;
    }

 
    public String toString() {
        return  "=== PERSON DATA ===\n" +
                "Name : " + name + "\n" +
                "Age  : " + age + "\n" +
                "===================";
    }
}
