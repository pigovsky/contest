using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player
{
    private static int xSize = 41;
    private static int ySize = 19;
    
    static void Main(string[] args)
    {
        string[] inputs = Console.ReadLine().Split(' ');
        int LX = int.Parse(inputs[0]); // the X position of the light of power
        int LY = int.Parse(inputs[1]); // the Y position of the light of power
        int TX = int.Parse(inputs[2]); // Thor's starting X position
        int TY = int.Parse(inputs[3]); // Thor's starting Y position
        
        bool isMoving = false;
        string moveAxes = "";
        
        // game loop
        while (true)
        {
            int E = int.Parse(Console.ReadLine());
            
            bool isAngle = IsAngle(TX, LX, TY, LY);
            
            if(isMoving)
            {
                if(!isAngle)
                {
                    if(moveAxes == "X" && TX == LX)
                    {
                        isMoving = false;
                        moveAxes = "";
                    }
                    else if(moveAxes == "Y" && TY == LY)
                    {
                        isMoving = false;
                        moveAxes = "";
                    }
                    
                    if(moveAxes == "Angle")
                    {
                        isMoving = false;
                        moveAxes = "";
                    }
                }
            }
            
            if(isAngle)
            {
                string angle = GetAngleDestination(TX, LX, TY, LY);
            
                Console.WriteLine(angle);
                        
                isMoving = true;
                moveAxes = "Angle";
                
                switch(angle)
                {
                    case "NE": TX++; TY--; break;
                    case "SW": TX--; TY++; break;
                    case "NW": TX--; TY--; break;
                    case "SE": TX++; TY++; break;
                }
            }
            
            if(!isAngle)
            {
                Console.Error.WriteLine(moveAxes);
                
                if(moveAxes == "" || moveAxes == "X")
                {
                    if(LX > TX)
                    {
                        Console.WriteLine("E");
                        
                        isMoving = true;
                        moveAxes = "X";
                    }
                    else if(LX < TX)
                    {
                        Console.WriteLine("W");
                        
                        isMoving = true;
                        moveAxes = "X";
                    }
                }
                    
                if(moveAxes == "" || moveAxes == "Y")
                {
                    if(LY > TY)
                    {
                        Console.WriteLine("S");
                        
                        isMoving = true;
                        moveAxes = "Y";
                    }
                    else if(LY < TY)
                    {
                        Console.WriteLine("N");
                        
                        isMoving = true;
                        moveAxes = "Y";
                    }
                }
            }
        }
    }
    
    private static bool IsAngle(int tx, int lx, int ty, int ly)
    {
        if(tx != lx && ty != ly)
        {
            return true;
        }
        
        return false;
    }
    private static string GetAngleDestination(int tx, int lx, int ty, int ly)
    {
        string destination = "";
        
        tx++;
        ty++;
        
        lx++;
        ly++;
        
        if(tx > lx && ty > ly)
        {
            destination = "NE";
        }
        else if(tx > lx && ty < ly)
        {
            destination = "SW";
        }
        else if(tx < lx && ty > ly)
        {
            destination = "NW";
        }
        else if(tx < lx && ty < ly)
        {
            destination = "SE";
        }
        
        if(GetChar(destination, 1) == "E" && tx + 1 == xSize)
        {
            destination = destination.Remove(1, 1);
        }
        else if(GetChar(destination, 1) == "W" && tx - 1 == 0)
        {
            destination = destination.Remove(1, 1);
        }
        
        if(GetChar(destination, 0) == "N" && ty - 1 == 0)
        {
            destination = destination.Remove(0, 1);
        }
        else if(GetChar(destination, 0) == "S" && ty + 1 == ySize)
        {
            destination = destination.Remove(0, 1);
        }
        
        Console.Error.WriteLine(ty + 1 == ySize);
        
        return destination;
    }
    
    private static string GetChar(string text, int id)
    {
        return text.ToCharArray()[id].ToString();
    }
}