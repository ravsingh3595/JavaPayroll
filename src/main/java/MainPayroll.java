
//import java.util.Scanner;
import java.io.*;

public class MainPayroll {

    public static void main(String arg[]) throws IOException
    {
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);

        System.out.println("Employee Database System");
        CommissionBasedPartTime employee = new CommissionBasedPartTime();
        //Employee e1 = new CommissionBasedPartTime();

        System.out.print("Employee Name: ");
        employee.setName(br.readLine());
        System.out.print("Age: ");
        employee.setCalBirthYear(br.read());

        System.out.print("Select your Employment type," +
                " Choose any option from the following " +
                "\na. Commission Based PartTime" +
                "\nb. Fixed Based PartTime" +
                "\nc. Intern" +
                "\nd. FullTime" );
        String employmentType = br.readLine();

        System.out.println(employmentType);
        switch (employmentType)
        {
            case "a":
            case "A":
                System.out.println("Commission Based PartTime Employee");
                break;
            case "b":
            case "B":
                System.out.println("Fixed Based PartTime Employee");
                break;
            case "c":
            case "C":
                System.out.println("Intern");
                break;
            case "d":
            case "D":
                System.out.println("FullTime Employee");
                break;
            default:
                System.out.println("Incorrect Input");
                break;
        }
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
