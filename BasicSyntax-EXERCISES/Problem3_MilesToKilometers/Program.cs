using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problem3_MilesToKilometers
{
    class Program
    {
        static void Main(string[] args)
        {
            var kilometers = double.Parse(Console.ReadLine());
            var miles = kilometers * 1.60934;

            Console.WriteLine($"{miles:f2}");
        }
    }
}
