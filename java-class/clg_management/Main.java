package clg_management;
import clg_management.inherit.Staff;
import clg_management.inherit.Student;

public class Main {
    public static void main(String[] args) {
    Staff staff = new Staff();
    staff.setName("Vijay");
    staff.setAge(30);
    staff.setSalary(50000);

    // staff.introduce();
    // staff.doPerReview();
    
    Student student = new Student();

    student.doActivity();
    staff.doActivity();
}
}
