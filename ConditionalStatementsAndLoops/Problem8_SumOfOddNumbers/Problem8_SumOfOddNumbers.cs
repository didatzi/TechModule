using System;

namespace Problem8_SumOfOddNumbers
{
    class Problem8_SumOfOddNumbers
    {
        static void Main(string[] args)
        {
            var num = int.Parse(Console.ReadLine());
            var currentNum = 1;
            var sum = 0;
            for (int i = 1; i <= num; i++)
            {
                Console.WriteLine(currentNum);
                sum += currentNum;
                currentNum = currentNum + 2;
            }
            Console.WriteLine("Sum: {0}", sum);
        }
    }
}
