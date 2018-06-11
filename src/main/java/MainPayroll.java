
import java.util.Scanner;

public class MainPayroll {

    public static void main(String arg[]){

        String name;
        int age;
        String type1;
        char type;
        Scanner emp1 = new Scanner(System.in);

        System.out.print("Enter Your Name: " );
        name = emp1.nextLine();
        System.out.print("Enter Your Age: " );
        age = emp1.nextInt();

        System.out.print("What type of Vehicle you drive," +
                " Choose any option from the following " +
                "\na. Car" +
                "\nb. Motorcycle" +
                "\nc. No vehicle/ Other \n" );
        type1 = emp1.nextLine();
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


        }




       // System.out.println("The name is: " + name + " and Age is " + age);




    }
}




//        Employee e1 = new CommissionBasedPartTime("Ravneet Singh", 23, 14f, 20f, 10f);
//        e1.printMyData();
