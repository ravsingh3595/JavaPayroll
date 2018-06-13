
//import java.util.Scanner;
import java.io.*;

public class MainPayroll {

    public static void main(String arg[]) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Employee Database System");
        CommissionBasedPartTime employeeC = new CommissionBasedPartTime();
        FixedBasedPartTime empF = new FixedBasedPartTime();
        FullTime employeeData = new FullTime();
        Intern empData = new Intern();
        //Employee e1 = new Employee();

        System.out.print("Employee Name: ");
        employeeC.setName(br.readLine());
        System.out.print("Age: ");
        String a1 = br.readLine();
        int a = Integer.parseInt(a1);
        //employeeC.setCalBirthYear(a);

        System.out.print("Select your Employment type," +
                " Choose any option from the following " +
                "\na. Commission Based PartTime" +
                "\nb. Fixed Based PartTime" +
                "\nc. Intern" +
                "\nd. FullTime\n");

        // System.out.print("hello");
        String employmentType = br.readLine();
        //System.out.println(employmentType);
        switch (employmentType) {
            case "a":
            case "A":

                System.out.println("Commission Based PartTime Employee");
                System.out.println("Enter your hourly pay:");
                employeeC.setRate(br.read());
                System.out.println("Enter Number of hours worked: ");
                String a2 = br.readLine();
                int a3 = Integer.parseInt(a1);
                employeeC.setHoursWorked(a3);
                System.out.println("Enter the Commission: ");
                String a4 = br.readLine();
                int a5 = Integer.parseInt(a4);
                employeeC.setCommissionPercentage(a5);      //change the format to flaot right now getting int.
                break;

            case "b":
            case "B":
                System.out.println("Fixed Based PartTime Employee");
                System.out.println("Enter your hourly pay:");
                String a6 = br.readLine();
                int a7 = Integer.parseInt(a6);
                empF.setRate(a7);
                System.out.println("Enter Number of hours worked: ");
                String a8 = br.readLine();
                int a9 = Integer.parseInt(a8);
                empF.setHoursWorked(a9);
                System.out.println("Enter your Fixed pay: ");
                String a10 = br.readLine();
                int a11 = Integer.parseInt(a10);
                empF.setFixedAmount(a11);                    //change the format to flaot right now getting int.
                break;

            case "c":
            case "C":

                System.out.println("Intern");
                System.out.println("Enter your School Name: ");
                empData.setSchoolName(br.readLine());
                break;

            case "d":
            case "D":

                System.out.println("FullTime Employee");
                System.out.println("Enter your Salary: ");
                String a12 = br.readLine();
                int a13 = Integer.parseInt(a12);
                employeeData.setSalary(a13);
                System.out.println("Enter the Bonus you got:");
                String a14 = br.readLine();
                int a15 = Integer.parseInt(a14);
                employeeData.setBonus(a15);
                break;

            default:
                System.out.println("Incorrect Input");
                break;
        }
//
//        System.out.println("What type of Vehicle you drive," +
//                " Choose any option from the following " +
//                "\na. Car" +
//                "\nb. Motorcycle" +
//                "\nc. No vehicle/ Other \n" );
//
//        String veh = br.readLine();
//
//        switch (veh)
//        {
//            case "a":
//            case 'A':
//                System.out.println("You have a Car");
//                break;
//            case 'b':
//            case 'B':
//                System.out.println("You have a MotorCycle");
//                break;
//            case 'c':
//            case 'C':
//                System.out.println("You don't like driving");
//                break;
//            default:
//                System.out.println("Incorrect Input");
//                break;
//
//        }break

    }
}

/*
 String name;
        int age;
        String type1;
        char type;
        Scanner employee = new Scanner(System.in);

        System.out.print("Enter Your Name: " );
        name = employee.nextLine();

        System.out.print("Enter Your Age: " );       //use try and catch here
        age = employee.nextInt();

        System.out.println("What type of Vehicle you drive," +
                " Choose any option from the following " +
                "\na. Car" +
                "\nb. Motorcycle" +
                "\nc. No vehicle/ Other \n" );

        type1 = employee.next();
        type = type1.charAt(0);

        switch (type)
        {
            case 'a':
            case 'A':
                System.out.println("You have a Car");
                break;
            case 'b':
            case 'B':
                System.out.println("You have a MotorCycle");
                break;
            case 'c':
            case 'C':
                System.out.println("You don't like driving");
                break;
            default:
                System.out.println("Incorrect Input");
                break;

 */


//        Employee e1 = new CommissionBasedPartTime("Ravneet Singh", 23, 14f, 20f, 10f);
//        e1.printMyData();
