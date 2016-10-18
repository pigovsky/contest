import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int LX = in.nextInt(); // the X position of the light of power
        int LY = in.nextInt(); // the Y position of the light of power
        int TX = in.nextInt(); // Thor's starting X position
        int TY = in.nextInt(); // Thor's starting Y position
        int SX = LX - TX;
        int SY = LY - TY;
        in.nextLine();

        // game loop
        while (true) {
            int E = in.nextInt(); // The level of Thor's remaining energy, representing the number of moves he can still make.
            in.nextLine();

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            // A single line providing the move to be made: N NE E SE S SW W or NW
        
            if(SX > 0){
                if(SY > 0){
                    System.out.println("SE");
                    SX--;
                    SY--;
                }else if(SY <0){
                    System.out.println("NE");
                    SX--;
                    SY++;
                }else{
                    System.out.println("E");
                    SX--;
                }
                
            }else if(SX <0){
                if(SY > 0){
                    System.out.println("SW");
                    SX++;
                    SY--;
                }else if(SY < 0){
                    System.out.println("NW");
                    SX++;
                    SY++;
                }else{
                    System.out.println("W");
                    SX++;
                    
                }
            }else{
                if(SY > 0){
                    System.out.println("S");
                    SY--;
                }else if(SY <0){
                    System.out.println("N");
                    SY++;
                }
            }
            
            
        }
    }
}