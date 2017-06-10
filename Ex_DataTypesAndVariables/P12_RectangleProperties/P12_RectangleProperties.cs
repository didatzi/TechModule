using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P12_RectangleProperties
{
    class P12_RectangleProperties
    {
        static void Main(string[] args)
        {
            double width = double.Parse(Console.ReadLine());
            double height = double.Parse(Console.ReadLine());

            double prerimeter = 2 * (width + height);
            double area = width * height;
            double diagonal = Math.Sqrt(width*width+height*height);

            Console.WriteLine(prerimeter);
            Console.WriteLine(area);
            Console.WriteLine(diagonal);
        }
    }
}
