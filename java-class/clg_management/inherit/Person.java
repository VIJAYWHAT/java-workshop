package clg_management.inherit;

public abstract class Person {
    
    // Comon attributes
    String collegeName;
    String name;
    int age;

    Person(){
        collegeName = "ABC College";
    }
    
    public void introduce() {
        System.out.println("Hello, I am " + name + " from " + collegeName + " and I am " + age + " years old.");
    }

    abstract void doActivity();

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCollegeName() {
        return collegeName;
    }

}
