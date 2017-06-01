using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problem2_RectangleArea
{
    class Program
    {
        static void Main(string[] args)
        {
            var wight = double.Parse(Console.ReadLine());
            var height = double.Parse(Console.ReadLine());
            var area = wight * height;

            Console.WriteLine($"{area:f2}");
        }
    }
}
