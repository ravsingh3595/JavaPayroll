/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

/**
 *
 * @author macstudent
 */
public class Employee {
      private String Name;
    private    int employeeid[];
 private   int age;
    private   float calculatebirthyear;
   private float calculateearnings;
   
   
   
    public Employee(String Name, int[] employeeid, int age, float calculatebirthyear, float calculateearnings) {
        this.Name = Name;
        this.employeeid = employeeid;
        this.age = age;
        this.calculatebirthyear = calculatebirthyear;
        this.calculateearnings = calculateearnings;
    }

   
   
   
   
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int[] getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int[] employeeid) {
        this.employeeid = employeeid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getCalculatebirthyear() {
        return calculatebirthyear;
    }

    public void setCalculatebirthyear(float calculatebirthyear) {
        this.calculatebirthyear = calculatebirthyear;
    }

    public float getCalculateearnings() {
        return calculateearnings;
    }

    public void setCalculateearnings(float calculateearnings) {
        this.calculateearnings = calculateearnings;
    }

    public void display()
    {
        
        System.out.println("---");
   
    }
}
	
	


