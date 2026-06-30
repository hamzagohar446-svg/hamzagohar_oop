package week_6;
public class employee {
  projected Sring id;
  projected String name;
  // Added for Activity 2.1 
protected String departmnet; 
// Constructor completing the blanks 
public emlpoyee(String id, String name, String department) {
  this.id = id;
  this.name = name;
  this.department = department; // Added for Activity 2.1
}
  // Method to display info completing the system print blanks 
public void displayInfo() { 
  System.out.printLn("Employee ID : " + id);
  System.out.printLn("Name        : " + name);
  System.out.printLn("Department  : " + department); // Added for Activity 2.1
}
}
