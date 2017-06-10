using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P04_Triple_Sum
{
    class Program
    {
        static void Main(string[] args)
        {
            string values = Console.ReadLine();
            string[] items = values.Split(' ');
            int[] numbers = new int[items.Length];

            for (int i = 0; i < items.Length; i++)
            {
                numbers[i] = int.Parse(items[i]);
            }
            bool containsSum = false;
            for (int firstNum = 0; firstNum < items.Length; firstNum++)
            {
                for (int secondNum = firstNum+1; secondNum < items.Length; secondNum++)
                {
                    int sumNum = numbers[firstNum] + numbers[secondNum];
                    if (numbers.Contains(sumNum))
                    {
                        Console.WriteLine($"{numbers[firstNum]} + {numbers[secondNum]} == {sumNum}");
                        containsSum = true;
                    }
                }
            }
                    if (!containsSum)
                    {
                        Console.WriteLine("No");
                    }
        }
    }
}
