import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int LX = in.nextInt(); // the X position of the light of power
        int LY = in.nextInt(); // the Y position of the light of power
        int TX = in.nextInt(); // Thor's starting X position
        int TY = in.nextInt(); // Thor's starting Y position
        in.nextLine();
    
        // game loop
        while (true) {
            int E = in.nextInt(); // The level of Thor's remaining energy, representing the number of moves he can still make.
            in.nextLine();
    
            String direction = "";
        	if (TY < LY) {
                TY++;
                direction = "S";
        	    
        	} else if (TY > LY) {
                TY--;
                direction = "N";
            } 
            
            if (TX < LX) {
                TX++;
                direction += "E";
            } else if (TX > LX) {
                TX--;
                direction += "W";
            }
            
            System.out.println(direction);
        }
    }
}
