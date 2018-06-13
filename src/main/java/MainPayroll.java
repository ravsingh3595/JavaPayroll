
//import java.util.Scanner;
import java.io.*;

public class MainPayroll {

    public static void main(String[] arg) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Employee Database System");

        //Object of all Child Classes
        CommissionBasedPartTime empCom = new CommissionBasedPartTime();
        FixedBasedPartTime empFix = new FixedBasedPartTime();
        Intern empIntern = new Intern();
        FullTime empFullTime = new FullTime();


        System.out.print("Employee Name: ");
        String empName = br.readLine();

        System.out.print("Age: ");
        String sEmpAge = br.readLine();                                               //sEmpAge = String of empAge
        int empAge = Integer.parseInt(sEmpAge);


        System.out.print("Select your Employment type," +
                " Choose any option from the following " +
                "\na. Commission Based PartTime" +
                "\nb. Fixed Based PartTime" +
                "\nc. Intern" +
                "\nd. FullTime\n");


        String employmentType = br.readLine();
        switch (employmentType) {

            case "a":
            case "A":

                System.out.println("Commission Based PartTime Employee");

                System.out.println("Enter your hourly pay:");
                String sPayC = br.readLine();                                       //sPayC = String of hourly pay for Commission
                float fPayC = Float.parseFloat(sPayC);                              //fPayC = float value of sPay for Commission


                System.out.println("Enter Number of hours worked: ");
                String sHourWorkedC = br.readLine();                                //sHourWorkedC = String of hours worked for Commission
                float fHourWorkedC = Float.parseFloat(sHourWorkedC);                //fHourWorkedC = float value of sHourWorked for Commission

                System.out.println("Enter the Commission: ");
                String sCommission = br.readLine();                                //sCommission = String of Commission
                float fCommission  = Float.parseFloat(sCommission);                //fCommission = float value of Commission

                //Assigning values
                //CommissionBasedPartTime empCom = new CommissionBasedPartTime();
                empCom.setName(empName);
                empCom.setAge(empAge);
                empCom.setRate(fPayC);
                empCom.setHoursWorked(fHourWorkedC);
                empCom.setCommissionPercentage(fCommission);

                //printing all the data

                //empCom.printMyData();

                break;

            case "b":
            case "B":

                System.out.println("Fixed Based PartTime Employee");

                System.out.println("Enter your hourly pay:");
                String sPayF = br.readLine();                                    //sPayF = String of hourly pay for Fixed Based
                float fPayF = Float.parseFloat(sPayF);                           //fPayF = float value of sPay for Fixed based

                System.out.println("Enter Number of hours worked: ");
                String sHourWorkedF = br.readLine();                             //sHourWorkedF = String of hours worked for Fixed Based
                float fHourWorkedF = Float.parseFloat(sHourWorkedF);             //fHourWorkedF = float value of sHourWorked for Fixed Based

                System.out.println("Enter your Fixed pay: ");
                String sFixedPay = br.readLine();                                //sFixedPay = String of Fixed Based
                float fFixedPay = Float.parseFloat(sFixedPay);                   //fFixedPay = float value of Fixed Based

                //Assigning values
                //FixedBasedPartTime empFix = new FixedBasedPartTime();
                empFix.setName(empName);
                empFix.setAge(empAge);
                empFix.setRate(fPayF);
                empFix.setHoursWorked(fHourWorkedF);
                empFix.setFixedAmount(fFixedPay);

                break;

            case "c":
            case "C":

                System.out.println("Intern");

                System.out.println("Enter your School Name: ");
                String sSchoolName = br.readLine();                              //sSchoolName = String of School Name

                //Assigning values
                //Intern empIntern = new Intern();
                empIntern.setName(empName);
                empIntern.setAge(empAge);
                empIntern.setSchoolName(sSchoolName);

                break;

            case "d":
            case "D":

                System.out.println("FullTime Employee");

                System.out.println("Enter your Salary: ");
                String sSalary = br.readLine();                                 //sSalary = String of Salary
                float fSalary = Float.parseFloat(sSalary);                      //fSalary = float value of sSalary

                System.out.println("Enter the Bonus you got:");
                String sBonus = br.readLine();                                  //sBonus = String of Bonus
                float fBonus = Float.parseFloat(sBonus);                        //fBonus = float value of sBonus

                //Assigning values
                //FullTime empFullTime = new FullTime();
                empFullTime.setName(empName);
                empFullTime.setAge(empAge);
                empFullTime.setSalary(fSalary);
                empFullTime.setBonus(fBonus);

                break;

            default:
                System.out.println("Incorrect Input");
                break;
        }

        System.out.println("What type of Vehicle you drive," +
                " Choose any option from the following " +
                "\na. Car" +
                "\nb. Motorcycle" +
                "\nc. No vehicle/ Other \n");

        String veh = br.readLine();

        switch (veh) {

            case "a":
            case "A":

                System.out.println("You have a Car");

                System.out.println("Enter the Brand of the car you drive ");
                String sBrandC = br.readLine();                                                //sSalaryC = String of Brand for car
                System.out.println("What is your Car's Plate Number? ");
                String sPlateC = br.readLine();                                                //sSalaryC = String of plate for car
                System.out.println("What is the colour of your car? ");
                String sColourC = br.readLine();                                               //sColourC = String of colour for car
                System.out.println("What is the manufacturing year of your car? ");
                String sYearC = br.readLine();                                                 //sYearC = String of plate for car
                int iYearC = Integer.parseInt(sYearC);                                         //iYearC = integer of sYearC for car
                System.out.println("What is the Storage capacity of your car in litres? ");
                String sCapacityC = br.readLine();                                             //sCapacityC = String of Capacity for car
                float fCapacityC = Float.parseFloat(sCapacityC);                               //fCapacityC = float of sCapacityC for car
                System.out.println("What is the seat count of your car? ");
                String sSeatC = br.readLine();                                                 //sSeatC = String of Seat Count for car
                int iSeatC = Integer.parseInt(sSeatC);                                         //iSeatC = integer of sSeatC for car

                //Assigning Values
                /*Vehicle empCar = new Car();
                empCar.setCompany(sBrandC);
                empCar.setPlate(sPlateC);
                empCar.setColour(sColourC);
                empCar.setYear(iYearC);
                ((Car) empCar).setStorageCapacity(fCapacityC);
                ((Car) empCar).setSeatCount(iSeatC);
                */

                if (employmentType.equals("a") || employmentType.equals("A") )
                {
                    empCom.v1.setCompany(sBrandC);
                    empCom.v1.setPlate(sPlateC);
                    empCom.v1.setColour(sColourC);
                    empCom.v1.setYear(iYearC);
                    ((Car) empCom.v1).setStorageCapacity(fCapacityC);
                    ((Car) empCom.v1).setSeatCount(iSeatC);
                }
                if (employmentType.equals("b") || employmentType.equals("B") )
                {
                    empFix.v1.setCompany(sBrandC);
                    empFix.v1.setPlate(sPlateC);
                    empFix.v1.setColour(sColourC);
                    empFix.v1.setYear(iYearC);
                    ((Car) empFix.v1).setStorageCapacity(fCapacityC);
                    ((Car) empFix.v1).setSeatCount(iSeatC);
                }
                if (employmentType.equals("c") || employmentType.equals("C") )
                {
                    empIntern.v1.setCompany(sBrandC);
                    empIntern.v1.setPlate(sPlateC);
                    empIntern.v1.setColour(sColourC);
                    empIntern.v1.setYear(iYearC);
                    ((Car) empIntern.v1).setStorageCapacity(fCapacityC);
                    ((Car) empIntern.v1).setSeatCount(iSeatC);
                }
                if (employmentType.equals("d") || employmentType.equals("D") )
                {
                    empFullTime.v1.setCompany(sBrandC);
                    empFullTime.v1.setPlate(sPlateC);
                    empFullTime.v1.setColour(sColourC);
                    empFullTime.v1.setYear(iYearC);
                    ((Car) empFullTime.v1).setStorageCapacity(fCapacityC);
                    ((Car) empFullTime.v1).setSeatCount(iSeatC);
                }
                else {
                    //System.out.println("Incorrect Input for the vehicle type");
                }

                break;

            case "b":
            case "B":

                System.out.println("You have a MotorCycle");

                System.out.println("Enter the Brand of the MotorCycle you drive ");
                String sBrandM = br.readLine();                                               //sSalaryM = String of Brand for motorcycle
                System.out.println("What is your MotorCycle's Plate Number? ");
                String sPlateM = br.readLine();                                               //sSalaryM = String of plate for motorcycle
                System.out.println("What is the colour of your MotorCycle? ");
                String sColourM = br.readLine();                                              //sColourM = String of colour for motorcycle
                System.out.println("What is the manufacturing year of your MotorCycle? ");
                String sYearM = br.readLine();                                                //sYearM = String of plate for motorcycle
                int iYearM = Integer.parseInt(sYearM);                                        //iYearM = integer of sYear for motorcycle
                System.out.println("What is the Horse-Power of your MotorCycle?");
                String sPowerM = br.readLine();                                              //sPowerM = String of Horse-Power for motorcycle
                float fPowerM = Float.parseFloat(sPowerM);                                   //fPowerM = float of sPowerM for motorcycle
                System.out.println("What is the Top-speed of your MotorCycle? ");
                String sSpeedM = br.readLine();                                              //sSpeedM = String of Top-Speed for motorcycle
                float fSpeedM = Float.parseFloat(sSpeedM);                                   //fSpeedM = float of sSpeedM for motorcycle

                //Assigning Values
                Vehicle empMotorCycle = new Motorcycle();
                empMotorCycle.setCompany(sBrandM);
                empMotorCycle.setPlate(sPlateM);
                empMotorCycle.setColour(sColourM);
                empMotorCycle.setYear(iYearM);
                ((Motorcycle) empMotorCycle).setEnginePower(fPowerM);
                ((Motorcycle) empMotorCycle).setTopSpeed(fSpeedM);

                break;

            case "c":
            case "C":

                System.out.println("You don't like driving");

                break;

            default:

                System.out.println("Incorrect Input");
                break;
        }
        System.out.println("Want to print output");
        String output = br.readLine();
        if(output.equals("yes") || output.equals("Yes") || output.equals("YES")) {
            empCom.printMyData();
            empCom.v1.printMyData();
        }
        else
            {
                System.out.println("Thank You!, Bye");
            }
    }
}