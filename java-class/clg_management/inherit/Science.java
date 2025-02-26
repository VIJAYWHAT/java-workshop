package clg_management.inherit;

public class Science extends Student {
    
    String subject;

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void takeEvaluation() {
        System.out.println("Science Student Take an evaluation");
    }
    
}
