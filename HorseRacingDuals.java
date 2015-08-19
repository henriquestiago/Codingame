import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int horseRace[] = new int[N];;
        for (int i = 0; i < N; i++) {
            horseRace[i] = in.nextInt();
        }
        
        Arrays.sort(horseRace);

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        /*int dif=10000000;
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                int diff = Math.abs(horseRace[j]-horseRace[i]);
                if(diff < dif)
                    dif = diff;
            }
        }*/
        
        int aux = 10000000;
        for(int i=1;i<N;i++){
            int dif = Math.abs(horseRace[i]-horseRace[i-1]);
            if(dif < aux)
                aux = dif;
        }

        System.out.println(aux);
    }
}
