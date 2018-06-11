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
public class Parttime extends Employee{
   private int rate;
    private int hourworked;
    


    public Parttime(int rate, int hourworked, String Name, int[] employeeid, int age, float calculatebirthyear, float calculateearnings) {
        super(Name, employeeid, age, calculatebirthyear, calculateearnings);
        this.rate = rate;
        this.hourworked = hourworked;
    }
    
    

    
   
    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHourworked() {
        return hourworked;
    }

    public void setHourworked(int hourworked) {
        this.hourworked = hourworked;
    }
    
    
    
    
}  

