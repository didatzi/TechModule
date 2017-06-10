using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P02_ReverseArrayOfIntegers
{
    class P02_ReverseArrayOfIntegers
    {
        static void Main(string[] args)
        {
            int num = int.Parse(Console.ReadLine());
            int[] arrInt = new int[num];
            for (int i = 0; i < num; i++)
            {
                arrInt[i] = int.Parse(Console.ReadLine());
            }
            for (int i = arrInt.Length - 1; i >= 0; i--)
            {
                Console.Write($"{arrInt[i]} ");
            }
        }
    }
}
