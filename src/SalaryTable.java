
import java.util.Scanner;


public class SalaryTable {

    
    public static void main(String[] args) {
        //newbie pay at 40,000
        // 3% increase per year for 10 years up to 30%
        //year
        // old salary
        // raise 
        // new salary
        Scanner s = new Scanner(System.in);
        double osal=0, raise=40000, nsal=40000;
        //final double start = 40000;
        System.out.format("%s%20s%10s%20s\n","YEAR","OLD SALARY","RAISE","NEW SALARY");
        System.out.format("%s%20s%10s%20s\n","====","==========","=====","==========");
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d\t      $%.2f\t     $%4.2f\t    $%4.2f",i,osal,raise,nsal);
            osal = nsal;//40000
            raise = osal * 0.03; //40000
            nsal = osal + raise;
            System.out.format("\n");
            
            
        }
    }
    
}
