using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problem_1.Array_Statistics
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = Console.ReadLine().Split().Select(int.Parse).ToArray();

            double sum = 0d;
            for (int i = 0; i < arr.Length; i++)
            {
                sum = sum + arr[i];

            }
            Array.Sort(arr);
            double avarege = sum / arr.Length;

            Console.WriteLine($"Min = {arr[0]}");
            Console.WriteLine($"Max = {arr[arr.Length-1]}");
            Console.WriteLine($"Sum = {sum}");
            Console.WriteLine($"Average = {avarege}");
        }
    }
}
