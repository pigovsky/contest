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
    static void Main(string[] args)
    {
        string[] inputs = Console.ReadLine().Split(' ');
        int LX = int.Parse(inputs[0]); // the X position of the light of power
        int LY = int.Parse(inputs[1]); // the Y position of the light of power
        int TX = int.Parse(inputs[2]); // Thor's starting X position
        int TY = int.Parse(inputs[3]); // Thor's starting Y position

        // game loop
        while (true)
        {
            int E = int.Parse(Console.ReadLine());
            
            if (LX != TX && LY != TY)
            {
                if (LX < TX && LY < TY)
                {
                    Console.WriteLine("NW");
                }
                else if (LX > TX && LY < TY)
                {
                    Console.WriteLine("NE");
                }
                if (LX > TX && LY > TY)
                {
                 Console.WriteLine("SE");
                }
                else if (LX < TX && LY > TY)
                {
                 Console.WriteLine("SW");
                }
            }
            else
            {
                if (LX < TX)
                {
                    Console.WriteLine("W");
                }
                else if (LY < TY)
                {
                    Console.WriteLine("N");
                }
            
                if (TX < LX)
                {
                    Console.WriteLine("E");
                }
                else if (TY < LY)
                {
                    Console.WriteLine("S");
                } 
            }
        }   
    }
}
