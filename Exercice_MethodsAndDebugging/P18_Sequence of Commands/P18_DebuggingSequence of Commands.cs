using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P18_Sequence_of_Commands
{
    class P18_DebuggingSequence
    {
        private const char ArgumentsDelimiter = ' ';

        public static void Main()
        {
            int sizeOfArray = int.Parse(Console.ReadLine());
            long[] array = Console.ReadLine().Split(ArgumentsDelimiter).
                Select(long.Parse).ToArray();

            while (true)
            {
                string[] command = Console.ReadLine().Split();
                if (command[0].Equals("stop"))
                {
                    break;
                }

                int[] args = new int[2];
                if (command[0].Equals("add") ||
                    command[0].Equals("subtract") ||
                    command[0].Equals("multiply"))
                {
                    args[0] = int.Parse(command[1]);
                    args[1] = int.Parse(command[2]);
                    PerformAction(array, command, args);

                }
                else
                {
                    PerformAction(array, command, args);
                }

                PrintArray(array);
                Console.WriteLine();

            }
        }

        static long[] PerformAction(long[] array, string[] action, int[] args)
        {

            int pos = args[0] - 1;
            int value = args[1];

            switch (action[0])
            {
                case "multiply":
                    array[pos] *= value;
                    break;
                case "add":
                    array[pos] += value;
                    break;
                case "subtract":
                    array[pos] -= value;
                    break;
                case "lshift":
                    ArrayShiftLeft(array);
                    break;
                case "rshift":
                    ArrayShiftRight(array);
                    break;
            }
            return array;

        }

        private static void ArrayShiftRight(long[] array)
        {
            long rightNum = array[array.Length - 1];
            for (int i = array.Length - 1; i >= 1; i--)
            {
                array[i] = array[i - 1];
            }
            array[0] = rightNum;
        }

        private static void ArrayShiftLeft(long[] array)
        {
            long leftNum = array[0];
            for (int i = 0; i < array.Length - 1; i++)
            {
                array[i] = array[i + 1];
            }
            array[array.Length - 1] = leftNum;
        }

        private static long[] PrintArray(long[] array)
        {
            for (int i = 0; i < array.Length; i++)
            {
                Console.Write(array[i] + " ");
            }
            return array;
        }
    }
}
