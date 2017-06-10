using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P08_HouseBuilder
{
    class P08_HouseBuilder
    {
        static void Main(string[] args)
        {
            long firstPrice = int.Parse(Console.ReadLine());
            long secondPrice = int.Parse(Console.ReadLine());
            long totalPrice = 0;
            if (firstPrice<=sbyte.MaxValue)
            {
                totalPrice = firstPrice * 4 + secondPrice * 10;
            }
            else
            {
                totalPrice = firstPrice * 10 + secondPrice * 4;
            }
            Console.WriteLine(totalPrice);
        }
    }
}
