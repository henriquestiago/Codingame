import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {
    
    public static double replaceV(String number){
        if(number.contains(","))
            number = number.replace(",", ".");
        return Double.parseDouble(number);    
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String LON = in.next();
        in.nextLine();
        String LAT = in.next();
        in.nextLine();
        int N = in.nextInt();
        in.nextLine();
        
        Double min = null;
        String name = null;
        for(int i=0; i < N;i++){
            Defibrillator def = new Defibrillator(in.nextLine());
            double dist = def.dist(replaceV(LON),replaceV(LAT));
            if(min == null || dist < min){
                min = dist;
                name = def.getName();
            }
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(name);
        
    }
}    
        
        class Defibrillator {
            private String id;
            private String name;
            private String address;
            private String phone;
            private double lon;
            private double lat;
        
            
            public Defibrillator(String st){
                String str[] = st.split(";");
                id = str[0];
                name = str[1];
                address = str[2];
                if(str.length >= 6) {
                    phone = str[3];
                }
                lon = Solution.replaceV(str[str.length-2]);
                lat = Solution.replaceV(str[str.length-1]);
            }
            
            public String getName(){
                return name;
            }
            
            public double dist(double lonX,double latX){
                double x = (lon-lonX)*Math.cos((latX+lat)/2);
                double y = (lat-latX);
                double d = Math.sqrt(Math.pow(x,2)+Math.pow(y,2))*6371;
                return d;
            }
        }
