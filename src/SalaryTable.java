
import java.text.*;
import java.util.Scanner;


public class SalaryTable {

    
    public static void main(String[] args) {
        //newbie pay at 40,000
        // 3% increase per year for 10 years up to 30%
        //year
        // old salary
        // raise 
        // new salary
        //NumberFormat nf = NumberFormat.getCurrencyInstance(); formats numbers in a currency format.
        DecimalFormat twoPlaces = new DecimalFormat("0.00");
        Scanner s = new Scanner(System.in);
        double osal=0, raise=40000, nsal=40000;
        //final double start = 40000;
        System.out.format("%s%20s%10s%20s\n","YEAR","OLD SALARY","RAISE","NEW SALARY");
        System.out.format("%s%20s%10s%20s\n","====","==========","=====","==========");
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d\t      $%s\t     $%s\t    $%s",i,twoPlaces.format(osal),twoPlaces.format(raise),twoPlaces.format(nsal));
            osal = nsal;//40000
            raise = osal * 0.03; //40000
            nsal = osal + raise;
            System.out.format("\n");
            /*
            cs
            analysis
            design
            implementation
            integration
            maintenance
            */
            
            
        }
    }
    
}
