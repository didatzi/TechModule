using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P03_EnglishNameOfLastDigit
{
    class P03_EnglishNameOfLastDigit
    {
        static void Main(string[] args)
        {
            long number = long.Parse(Console.ReadLine());
            Console.WriteLine(PrintLastDigitName(number)); 
        }

         static string PrintLastDigitName(long num)
        {
            num = Math.Abs(num % 10);
            string digitName = string.Empty;
            switch (num)
            {
                case 1:
                    digitName = "one";
                    break;
                case 2:
                    digitName = "two";
                    break;
                case 3:
                    digitName = "three";
                    break;
                case 4:
                    digitName = "four";
                    break;
                case 5:
                    digitName = "five";
                    break;
                case 6:
                    digitName = "six";
                    break;
                case 7:
                    digitName = "seven";
                    break;
                case 8:
                    digitName = "eight";
                    break;
                case 9:
                    digitName = "nine";
                    break;
                case 0:
                    digitName = "zero";
                    break;
                  
            }

            return digitName;
        }
    }
}
