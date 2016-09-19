using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Onboarding
{
    class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                Console.Write("name of enemy 1:");
                string enemy1 = Console.ReadLine();
                Console.Write("distance to enemy 1:");
                int dist1 = int.Parse(Console.ReadLine()); 
                Console.Write("name of enemy 2:");
                string enemy2 = Console.ReadLine();
                Console.Write("distance to enemy 2:");
                int dist2 = int.Parse(Console.ReadLine());

                Console.ForegroundColor = ConsoleColor.Red;
                if (dist1 < dist2)
                {
                    Console.WriteLine("Destroyed: " + enemy1);
                }
                else
                {
                    Console.WriteLine("Destroyed: " + enemy2);
                }
                Console.ForegroundColor = ConsoleColor.Gray;
                Console.WriteLine("\n");
            }
        }
    }
}
