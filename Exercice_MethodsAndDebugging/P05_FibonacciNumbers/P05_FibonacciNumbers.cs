using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P05_FibonacciNumbers
{
    class P05_FibonacciNumbers
    {
        static void Main(string[] args)
        {
            int fibonnaciNum = int.Parse(Console.ReadLine());
            Console.WriteLine(GetFibNum(fibonnaciNum));
        }

        static int GetFibNum(int n)
        {
            int firstNum = 0;
            int nextNum = 1;
            for (int i = 0; i < n; i++)
            {
                int tempNum = firstNum;
                firstNum = nextNum;
                nextNum = tempNum + nextNum;
            }
            return nextNum;
        }
    }
}
