import java.util.*;
import java.util.ArrayList;

public class MagicSquare {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();   //size of matrix
        int[][] matrix = new int[N][N];

        int dig = 0;        //top left to bottom right
        int anti_dig = 0;
        int k, j;

        int error_count = 0; 

        for(j=0; j<N; j++){
            for(k=0; k<N; k++){
                matrix[j][k] = in.nextInt();
            }            
            dig = dig + matrix[j][j];
            anti_dig = anti_dig + matrix[j][N-1-j];
        }

        int [] row_counts = new int[N];
        int [] column_counts = new int[N];

        for(j=0; j<N; j++){
            row_counts[j] = 0;
            column_counts[j] = 0;
            for(k=0; k <N; k++){
                row_counts[j] = row_counts[j] + matrix[j][k];
                column_counts[j] = column_counts[j] + matrix[k][j];
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        if(dig != anti_dig){
            list.add(0);
        }

        for(int i=0; i <N ; i++){
            if(row_counts[i] != dig){
                list.add(i+1);
            }

            if(column_counts[i] != dig){
                list.add(-(i+1));
            }
        }

        System.out.println(list.size());
        Collections.sort(list);

        for(int i=0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}


