using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problem10_MultiplicationTable2
{
    class Problem10_MultiplicationTable2
    {
        static void Main(string[] args)
        {
            var number = int.Parse(Console.ReadLine());
            var multiplier = int.Parse(Console.ReadLine());

            while (true)
            {
                Console.WriteLine($"{number} X {multiplier} = {number * multiplier}");
                if (multiplier > 9)
                {
                    break;
                }
               multiplier++;
            }
        }
    }
}
