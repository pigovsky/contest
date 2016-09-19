import java.util.*;
import java.io.*;
import java.math.*;

class Player {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int lightX = in.nextInt();
		int lightY = in.nextInt();
		int initialTX = in.nextInt();
		int initialTY = in.nextInt();

		int X=lightX-initialTX, Y=lightY-initialTY;

		while (true) {
			int remainingTurns = in.nextInt();
			String s = "";
			if(Y<0){
				s+="N";
				Y++;
			}
			else if(Y>0){
				s+="S";
				Y--;
			}

			if(X<0){
				s+="W";
				X++;
			}
			else if(X>0){
				s+="E";
				X--;
			}

			System.out.println(s);
		}
	}
}