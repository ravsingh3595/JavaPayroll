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
public class fulltime extends Employee {
   private float salary;
    private float bonus;
    private float calculateearning;

    public fulltime(float salary, float bonus, float calculateearning, String Name, int[] employeeid, int age, float calculatebirthyear, float calculateearnings) {
        super(Name, employeeid, age, calculatebirthyear, calculateearnings);
        this.salary = salary;
        this.bonus = bonus;
        this.calculateearning = calculateearning;
    }
    
    

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float getCalculateearning() {
        return calculateearning;
    }

    public void setCalculateearning(float calculateearning) {
        this.calculateearning = calculateearning;
    }
    
    
    
}



