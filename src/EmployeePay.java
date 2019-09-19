
import java.util.Scanner;


public class EmployeePay {

    //sdlc
    public static void main(String[] args) {
        //reg hours * hourly wage + overtime pay
        //input hours between 1 -70 
        //reg pay = 15/hr overtime 22.50/hr for workers over 40
        //use a for loop for 5 employees
        //while loop for hours between 1- 70
        //if statement to calculate pay for each employee
        Scanner s = new Scanner(System.in);
        double hours,rpay=0,r5pay=0;
        double total=0,opay=0,o5pay=0,total5=0;
        final double overtime =22.5;
        final int wage = 15;
        
        for (int i = 0; i < 5; i++) {
            System.out.format("Enter hours worked for Employee %d: ",(i+1));
            hours = s.nextInt();
            while(hours > 70 || hours < 1){
                System.out.println("ENTER HOURS WORKED BETWEEN 1 -70");
                System.out.format("Enter hours worked for Employee %d: ",(i+1));
                hours = s.nextInt();
            }
            if(hours > 40){
                opay =(overtime * (hours-40));
                rpay = (hours * wage);
                total = opay + rpay;
            }
            else{
                rpay = (hours * wage);
                total = (hours * wage);
            }
            r5pay+=rpay;
            o5pay+=opay;
            total5+=total;
            System.out.format("Regular Pay:  $%5.2f \n",rpay);
            System.out.format("Overtime Pay: $%5.2f \n",opay);
            System.out.format("Total Pay:    $%5.2f \n", total);
            System.out.println("----------------------------------------------");

            
            
        }
        System.out.format("Regular Pay for all five employees:  $%10.2f \n",r5pay);
        System.out.format("Overtime Pay for all five employees: $%10.2f \n",o5pay);
        System.out.format("Total Pay for all five employees:    $%10.2f \n", total5);
        
    }
    
}
