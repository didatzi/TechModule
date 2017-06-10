using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P03_WaterOverflow
{
    class P03_WaterOverflow
    {
        static void Main(string[] args)
        {
            sbyte numOfLines = sbyte.Parse(Console.ReadLine());
            int allLiters = 0;
            for (int i = 0; i < numOfLines; i++)
            {
                var litersToPour = short.Parse(Console.ReadLine());
                allLiters += litersToPour;
                if (allLiters > 255)
                {
                    Console.WriteLine("Insufficient capacity!");
                    allLiters -= litersToPour;
                }
            }
            Console.WriteLine(allLiters);
        }
    }
}
