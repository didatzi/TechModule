using System;

namespace P10_SumOfChars
{
    class P10_SumOfChars
    {
        static void Main(string[] args)
        {
            int totalChars = int.Parse(Console.ReadLine());
            int totalSumFromChars = 0;
            for (int i = 0; i < totalChars; i++)
            {
                char alfabetChars = char.Parse(Console.ReadLine());
                totalSumFromChars = totalSumFromChars + alfabetChars;
            }
            Console.WriteLine($"The sum equals: {totalSumFromChars}");
        }
    }
}
