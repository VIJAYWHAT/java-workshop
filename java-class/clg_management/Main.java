package clg_management;
import clg_management.inherit.Staff;
import clg_management.inherit.Student;
import clg_management.inherit.Math;
import clg_management.inherit.Science;

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

    Math math = new Math();
    Science science = new Science();

    math.takeEvaluation();
    science.takeEvaluation();
}
}
