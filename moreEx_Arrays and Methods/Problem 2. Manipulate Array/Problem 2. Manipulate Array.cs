using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problem_2.Manipulate_Array
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] arr = Console.ReadLine().Split(' ');
            int n = int.Parse(Console.ReadLine());
            for (int i = 0; i < n; i++)
            {
                string[] commands = Console.ReadLine().Split();
                switch (commands[0])
                {
                    case "Reverse":
                        ReverseArr(arr);
                       break;
                    case "Distinct":
                        arr = arr.Distinct().ToArray();
                        break;
                    case "Replace":
                        ReplaceArr(arr);
                        break;

                }
            }
            
            Console.WriteLine(string.Join(", ",arr));
        }

        private static string[] ReplaceArr(string[] arr)
        {
          
            return arr;
        }

        private static string[] ReverseArr(string[] arr)
        {
            string[] reversedArr = new string[arr.Length];
            for (int i = arr.Length - 1; i >= 0; i--)
            {
                reversedArr[i] = arr[arr.Length - 1 - i];
            }
            
            return reversedArr;
        }
    }
}
