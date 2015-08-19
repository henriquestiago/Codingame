import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
/*class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int min = 5526;
        int N = in.nextInt(); // the number of temperatures to analyse
        in.nextLine();
        String TEMPS = in.nextLine(); // the N temperatures expressed as integers ranging from -273 to 5526
    
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        System.out.println(TEMPS);
        if(N>0){
            for(int i=0;i<N;i++){
              char sub = TEMPS.charAt(i);
              if(sub != ' ' || sub != '-')
                if(Math.abs(sub) <= Math.abs(min))
                    min = Math.abs(sub);
            }
        }else
            System.out.println("0\n");

        System.out.println(min);

        //System.out.println("result");
    }
}*/

class Solution {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer temperature[] = new Integer[n];
		
		for (int i = 0; i < n; i++) {
			temperature[i] = in.nextInt();
			//System.out.println(temperature[i]);
		}
	    int min = 100000;
		for (int i = 0; i < n; i++) {
		    if(Math.abs(min) == Math.abs(temperature[i])){
		        if(min<temperature[i]){
		         min = temperature[i];
		        }
		    }else if(Math.abs(min) > Math.abs(temperature[i])){
		        
		         min = temperature[i];
		        
		    }
		}
		if(min==100000){
		    System.out.println("0");
		}else{
		    System.out.println(min);
		}
		
	}
}
