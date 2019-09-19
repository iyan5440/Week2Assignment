
import java.util.Scanner;


public class PowersChart {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int expo =0,scan,total;
        final int two =2;
        
        System.out.print("Enter an exponent: ");
        try{
            scan = s.nextInt();
        }catch(Exception e){
            
            System.out.println("ERROR");
            return;
        }
        
        

        while(scan >10 || scan <0){
            System.out.print("Enter an exponent: ");  
            if(s.hasNextInt()){
                scan = s.nextInt();
            }
            else{
                System.out.println("ERROR");
                s.nextLine();
                continue;
            }
            
            
        }
        
        for (int i = 0; i <= scan; i++) {
            // 2^0 - 2^7// 2^0 = 1, 2^1 =2,etc
            //total = two^i;
            System.out.format("%d\t",i);
            System.out.format("2^%d\n",i);
            System.out.println("===========");
            System.out.format("%d\t",i);
            System.out.println(Math.pow(two,i)); //System.out.println(Math.pow(x, 3)); // .pow == power 25^3 "%d\n\n",total
            
            
        }
        
        
        
    }
        
    
}
