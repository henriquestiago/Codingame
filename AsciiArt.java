import java.util.*;
import java.io.*;
import java.math.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {
    
    static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        in.nextLine();
        int H = in.nextInt();
        in.nextLine();
        String text = in.nextLine().toUpperCase();
        ArrayList<String> ascii = new ArrayList<String>();
		for(int i = 0; i < H; i++) {
			ascii.add(in.nextLine());
		}

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

       //find the necessary indexes of letters
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		for(char c : text.toCharArray()) {
			if(c < 'A' || c > 'Z') indexes.add(26);
			else {
				for(char letter : alphabet.toCharArray()) {
					if(c == letter) {
						indexes.add(alphabet.indexOf(letter));
					}
				}
			}
		}
		
		//print result
		for(int j = 0; j < H; j++) {
			for(int k = 0; k < indexes.size(); k++) {
				System.out.print(ascii.get(j).substring(indexes.get(k)*L, indexes.get(k)*L + L));
			}
			System.out.println();
		}
		in.close();

    }
}
