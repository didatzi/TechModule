using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P13_GameOfNumbers
{
    class P13_GameOfNumbers
    {
        static void Main(string[] args)
        {
            var n = int.Parse(Console.ReadLine());
            var m = int.Parse(Console.ReadLine());
            var magicNum = int.Parse(Console.ReadLine());
            var totalCombinations = 0;
            var sumNum = 0;
            for (int i = n; i <= m; i++)
            {
                for (int j = n; j <= m; j++)
                {
                    totalCombinations++;
                    sumNum = j + i;
                    if (sumNum == magicNum)
                    {
                        Console.WriteLine($"Number found! {j} + {i} = {magicNum}");
                        return;
                    }
                }
            }
            if (sumNum != magicNum)
            {
                Console.WriteLine($"{totalCombinations} combinations - neither equals {magicNum}");
            }

        }
    }
}
