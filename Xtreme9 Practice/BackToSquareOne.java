import java.util.*;

public class BackToSquareOne {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int N;
        double value = 1.0d;
        
        while(first != 0){
            N = first;

            for(int i=0; i< N-1; i++){
                double x = in.nextDouble();        
                value = (double)((value*(1.0/x)) + 1.0);
            }
            
            int d = (int) Math.round(value);
            System.out.println(d);
            value = 1.0d;
            first = in.nextInt();
        }
    }   
}


