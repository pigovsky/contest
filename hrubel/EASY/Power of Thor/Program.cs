using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Power_of_Thor
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write(PowerOfThor(-1, -3 , 2 ,2));
            Console.ReadLine();
        }
        static string PowerOfThor(int LX , int LY , int TX , int TY)
        {
            string result = "";
            while(LX != TX || LY != TY)
            {
                if (TY == LY)
                    result += "";
                else
                {
                    if (TY < LY)
                    {
                        result += "N";
                        TY++;
                    }
                    else
                    {
                        result += "S";
                        TY--;
                    }
                }
                if (TX == LX)
                    result += "";
                else
                {
                    if (TX < LX)
                    {
                        result += "E";
                        TX++;
                    }
                    else
                    {
                        result += "W";
                        TX--;
                    }
                }
                result += "\n";
            }

            return result;
        }
    }
}
