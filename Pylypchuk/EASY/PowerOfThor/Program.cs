using System;

class Program
{
    static void Main()
    {
        string[] inputs = Console.ReadLine().Split(' ');
        int lightX = int.Parse(inputs[0]);
        int lightY = int.Parse(inputs[1]);
        int thorX = int.Parse(inputs[2]);
        int thorY = int.Parse(inputs[3]);

        while (true)
        {
            string thorDirection = "";
            if (thorY < lightY)
            {
                thorY++;
                thorDirection = "S";
            }
            else if (thorY > lightY)
            {
                thorY--;
                thorDirection = "N";
            }

            if (thorX < lightX)
            {
                thorX++;
                thorDirection += "E";
            }
            else if (thorX > lightX)
            {
                thorX--;
                thorDirection += "W";
            }

            Console.WriteLine(thorDirection);
        }
    }
}