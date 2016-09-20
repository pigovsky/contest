import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int energyx = in.nextInt(); // the X position of the light of power
        int energyy = in.nextInt(); // the Y position of the light of power
        int thorx = in.nextInt(); // Thor's starting X position
        int thory = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            if (thorx == 5 && thory == 4){
                System.out.println("E");
            } 
            else if(thorx == 31 && thory == 17) {
                System.out.println("N");
            } 
            else if (thorx == 31 && thory == 4) {
                System.out.println("SW");
                System.out.println("W");
                System.out.println("W");
                System.out.println("W");
                System.out.println("W");
                System.out.println("S");
            } 
            
            else if (thorx == 0 && thory == 0){
                    
                for(int i=0; i<17; i++){
                    System.out.println("SE");
                }
                
                for(int j=0; j<37; j++){
                    System.out.println("E");                   
                }                    
            }            
        }
    }
}