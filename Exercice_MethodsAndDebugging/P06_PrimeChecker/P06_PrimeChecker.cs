using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P06_PrimeChecker
{
    class P06_PrimeChecker
    {
        static void Main(string[] args)
        {
            long n = long.Parse(Console.ReadLine());
            Console.WriteLine(IsPrime(n));
        }

        static bool IsPrime(long number)
        {

            if (number == 0 || number == 1)
            {
                return false;
            }
            var maxNum = Math.Sqrt(number);
            for (long currentNum = 2; currentNum <= maxNum; currentNum++)
            {
                if (number % currentNum == 0)
                {
                    return false;
                }
            }
            return true;

        }
    }
}
