using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problem11_OddNumber
{
    class Problem11_OddNumber
    {
        static void Main(string[] args)
        {
            var number = 1;
            while (true)
            {

                try
                {
                    number = Math.Abs(int.Parse(Console.ReadLine()));
                    if (number % 2 == 1)
                    {
                    Console.WriteLine($"The number is: {number}");
                        break;
                    }
                    Console.WriteLine("Please write an odd number.");
                }
                catch (Exception)
                {
                    Console.WriteLine("Please write an odd number.");
                }
            }

        }
    }
}
