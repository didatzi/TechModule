using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P07_PrimesInGivenRangeNew
{
    class P07_PrimesInGivenRangeNew
    {
        static void Main(string[] args)
        {
            int startNum = int.Parse(Console.ReadLine());
            int endNum = int.Parse(Console.ReadLine());

            var primes = FindPrimesInRange(startNum, endNum);
            Console.WriteLine(string.Join(", ", primes));
        }

        private static List<int> FindPrimesInRange(int startNum, int endNum)
        {
            var primes = new List<int>();
            for (int currentNum = startNum; currentNum <= endNum; currentNum++)
            {
                if (IsPrime(currentNum))
                {
                    primes.Add(currentNum);
                }
            }
            return primes;
        }

        static bool IsPrime(int number)
        {

            if (number == 0 || number == 1)
            {
                return false;
            }
           
            var maxNum = Math.Sqrt(number);
            for (int currentNum = 2; currentNum <= maxNum; currentNum++)
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
