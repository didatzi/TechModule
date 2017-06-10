using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P04_NumbersInReversedOrder
{
    class P04_NumbersInReversedOrder
    {
        static void Main(string[] args)
        {
            double number = double.Parse(Console.ReadLine());
            Console.WriteLine(ReversedNumber(number));
        }

        static double ReversedNumber(double number)
        {
            string reversedStr = new string(number.ToString().Reverse().ToArray());
            double reversedDouble = double.Parse(reversedStr);
            return reversedDouble;
        }
    }
}
