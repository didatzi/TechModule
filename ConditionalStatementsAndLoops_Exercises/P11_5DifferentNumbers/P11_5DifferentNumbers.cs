using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P11_5DifferentNumbers
{
    class P11_5DifferentNumbers
    {
        static void Main(string[] args)
        {
            var firstNum = int.Parse(Console.ReadLine());
            var lastNum = int.Parse(Console.ReadLine());

            if (Math.Abs(firstNum - lastNum) < 5)
            {
                Console.WriteLine("No");
            }
            else
            {
                for (int i = firstNum; i <= lastNum; i++)
                {
                    for (int j = firstNum; j < lastNum; j++)
                    {
                        for (int k = firstNum; k < lastNum; k++)
                        {
                            for (int l = firstNum; l < lastNum; l++)
                            {
                                for (int m = firstNum; m <= lastNum; m++)
                                {
                                    if (j <= i || k <= j || l <= k || m <= l)
                                        continue;

                                    else
                                    {
                                        Console.WriteLine($"{i} {j} {k} {l} {m}");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
