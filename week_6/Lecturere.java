package week_6;

public class lecturer extends employee {

    private String subject;

    // Constructor completing the blanks
    public lecturer(String id, String name, String subject, String department) {
        // Calls the constructor of the employee class
        super(id, name, department); 
        this.subject = subject;
    }

    // Method to display the subject completing the system print blank
    public void displaySubject() {
        System.out.println("Subject     : " + subject);
    }
}
