using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P02_Rotate_and_Sum
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] numberArray = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            int rotation = int.Parse(Console.ReadLine());

            int[] sumOfArrays = new int[numberArray.Length];

            for (int i = 0; i < rotation; i++)
            {
                RotateArray(numberArray);

                for (int j = 0; j < sumOfArrays.Length; j++)
                {
                    sumOfArrays[j] += numberArray[j];
                }
            }
            Console.WriteLine(string.Join(" ", sumOfArrays));
        }

        private static void RotateArray(int[] numberArray)
        {
            int lastElement = numberArray[numberArray.Length - 1];
            for (int j = numberArray.Length - 1; j > 0; j--)
            {
                numberArray[j] = numberArray[j - 1];
            }
            numberArray[0] = lastElement;
        }
    }
}

