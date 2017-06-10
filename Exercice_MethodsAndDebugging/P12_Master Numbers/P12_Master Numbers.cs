using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P12_Master_Numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            for (int num = 1; num <= n; num++)
            {
                if (IsPalindrome(num) &&
                (SumOfDigits(num) % 7 == 0) && ContainsEvenDigit(num))
                {
                    Console.WriteLine(num);
                }
            }
        }
        //polindrome
        static bool IsPalindrome(int num)
        {
            string digits = num.ToString();
            for (int i = 0; i < digits.Length / 2; i++)
                if (digits[i] != digits[digits.Length - i - 1])
                {
                    return false;
                }
            return true;
        }
        //sum of digits
        static int SumOfDigits(int num)
        {
            int sum = 0;
            while (num > 0)
            {
                sum += num % 10;
                num = num / 10;
            }
            return sum;
        }
        //number contains even digit
        static bool ContainsEvenDigit(int num)
        {
            string digits = num.ToString();
            for (int i = 0; i < digits.Length; i++)
            {
               if (digits[i] % 2 == 0)
                {
                    return true;
                }
            }
            return false;
        }
    }
}
