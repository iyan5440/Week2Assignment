
import java.util.Scanner;


public class divide {


    public static void main(String[] args) {
        // 2 ints as inputs 
        //displays  quotient and remainder
        Scanner s = new Scanner(System.in);
        int x1=0,x2=0,quo,rem;
        for (int i = 0; i < 2; i++) {
            System.out.format("Enter the value %d for division: ",(i+1));
            if(i==0){
                x1=s.nextInt();
            }
            else{
                x2=s.nextInt();
            }
        }
        //make sure high / low
        //also MOD
        if(x1 > x2){
            quo = x1/x2;
            rem = x1 % x2;
            System.out.format(" %d / %d = %d R%d",x1,x2,quo,rem);
        }
        else{
            quo = x2/x1;
            rem = x2 % x1;
            System.out.format(" %d / %d = %d R%d",x2,x1,quo,rem);
        }
        
    }
    
}
