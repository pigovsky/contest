using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
//C#
class Player
{
    static void Main(string[] args)
    {
        string[] inputs = Console.ReadLine().Split(' ');
        int lightX = int.Parse(inputs[0]); // the X position of the light of power
        int lightY = int.Parse(inputs[1]); // the Y position of the light of power
        int initialTX = int.Parse(inputs[2]); // Thor's starting X position
        int initialTY = int.Parse(inputs[3]); // Thor's starting Y position
        string Vec = "";
        // game loop
        while (true)
        {
            Vec = "";
            int remainingTurns = int.Parse(Console.ReadLine()); // The remaining amount of turns Thor can move. Do not remove this line.
            if((lightY - initialTY)>0)
            {
                Vec+="S";
                initialTY++;
            }
            if((lightY - initialTY)<0)
            {
                Vec+="N";
                initialTY--;
            }
            if((lightX - initialTX)<0)
            {
                Vec+="W";
                initialTX--;
            }
            if((lightX - initialTX)>0)
            {
                Vec+="E";
                initialTX++;
            }
            Console.WriteLine(Vec);
        }
    }
}
