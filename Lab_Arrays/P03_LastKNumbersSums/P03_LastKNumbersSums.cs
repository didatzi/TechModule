using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P03_LastKNumbersSums
{
    class P03_LastKNumbersSums
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int k = int.Parse(Console.ReadLine());

            long[] nSequence = new long[n];
            nSequence[0] = 1;
            for (int i = 1; i < n; i++)
            {
                
            long sumOfKElements = 0;
                int startIndex = Math.Max(0, i - k);

                for (int j = startIndex; j < i; j++)
                {
                    sumOfKElements += nSequence[j];
                }

                nSequence[i] = sumOfKElements;
            }
            Console.WriteLine(string.Join(" ",nSequence));
        }
    }
}
