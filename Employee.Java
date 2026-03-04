public class Employee{
    public String empName;
    public double empSalary;
    public String empDesignation;
    public void newEmployee(String n){
        empName = n;
        empSalary = 30000.0;
        empDesignation = "junior";
    }
    public void displayInfo(){
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee Salary: "+empSalary+" Tk");
        System.out.println("Employee Designation: "+empDesignation);
    }
    public void calculateTax(){
        if(empSalary>50000.0){
            double empTax = empSalary*0.30;
            System.out.println(empName+" tax amount "+empTax+" Tk");
        }
        else if(empSalary>30000.0){
            double empTax = empSalary*0.10;
            System.out.println(empName+" tax amount "+empTax+" Tk");
        }
        else{
            System.out.println("No need to pay tax");
        }
    }
    public void promoteEmployee(String newPost){
        if(newPost=="senior"){
            empSalary = empSalary+25000.0;
            empDesignation = "senior";
        }
        else if(newPost=="lead"){
            empSalary = empSalary+50000.0;
            empDesignation = "lead";
        }
        else if(newPost=="manager"){
            empSalary = empSalary+75000.0;
            empDesignation = "manager";
        }
        System.out.println(empName+" has been promoted to "+empDesignation);
        System.out.println("New salary: "+empSalary+" Tk");
    }
}
