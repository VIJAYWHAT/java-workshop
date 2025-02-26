package clg_management.inherit;

public class Staff extends Person {
    
    int salary;
    
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void doActivity() {
        System.out.println("Staff will be conducting the exams.");
    }

    public void doPerReview() {
        System.out.println("Performing review of staff.");
    }

}
