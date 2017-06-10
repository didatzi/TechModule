using System;
using System.Linq;
using System.Numerics;

namespace P14_Factorial_Trailing_Zeroes
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            BigInteger factorial = Factorial(n);
            int zeros = FactorialTrailingZeroes(factorial);
            Console.WriteLine(zeros);
        }

         static int FactorialTrailingZeroes(BigInteger num)
        {
            int timesZero = 0;

            while (num % 10 == 0)
            {
                num = num / 10;
                timesZero++;
            }
            return timesZero;
        }

        private static BigInteger Factorial(int n)
        {
             BigInteger factorial= 1;
            for (int i = 1; i <= n; i++)
            {
                factorial = factorial * i;
            }

            return factorial;
        }
    }
}
