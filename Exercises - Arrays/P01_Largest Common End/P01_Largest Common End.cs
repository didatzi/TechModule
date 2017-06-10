using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P01_Largest_Common_End
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] firstArray = Console.ReadLine().Split(' ').ToArray();
            string[] secondArray = Console.ReadLine().Split(' ').ToArray();

            int countLeft = 0;
            int countRight = 0;

            var smallerArrayLenght = Math.Min(firstArray.Length, secondArray.Length);
            for (int i = 0; i < smallerArrayLenght; i++)
            {
                if (firstArray[i] == secondArray[i])
                {
                    countLeft++;
                }
                if (firstArray[firstArray.Length - 1 - i] == secondArray[secondArray.Length - 1 - i])
                {
                    countRight++;
                }
            }
            Console.WriteLine(Math.Max(countLeft, countRight));
        }
    }
}
