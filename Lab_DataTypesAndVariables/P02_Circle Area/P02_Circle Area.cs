using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P02_Circle_Area
{
    class Program
    {
        static void Main(string[] args)
        {
            double centuries = double.Parse(Console.ReadLine());
            Console.WriteLine("{0:f12}", Math.PI * centuries * centuries);
        }
    }
}
