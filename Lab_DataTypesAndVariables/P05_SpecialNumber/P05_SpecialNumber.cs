using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P05_SpecialNumber
{
    class P05_SpecialNumber
    {
        static void Main(string[] args)
        {
            int allNumbers = int.Parse(Console.ReadLine());
            for (int number = 1; number <= allNumbers; number++)
            {
                var firstDigit = number / 10;
                var secondDigit = number % 10;
                var sumOfDigit = firstDigit + secondDigit;

                bool checkedNumber = (sumOfDigit == 5 || sumOfDigit == 7 || sumOfDigit == 11);

                Console.WriteLine($"{number} -> {checkedNumber}");

            }
        }
    }
}
