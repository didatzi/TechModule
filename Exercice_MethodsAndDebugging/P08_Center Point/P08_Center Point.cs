using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P08_Center_Point
{
    class Program
    {
        static void Main(string[] args)
        {
            double x1 = double.Parse(Console.ReadLine());
            double y1 = double.Parse(Console.ReadLine());

            double x2 = double.Parse(Console.ReadLine());
            double y2 = double.Parse(Console.ReadLine());

            if (PointIsCloserToCenter(x1, y1, x2, y2))
            {
                Console.WriteLine($"({x1}, {y1})");
            }
            else
            {
                Console.WriteLine($"({x2}, {y2})");
            }
        }

        private static bool PointIsCloserToCenter(double x1, double y1, double x2, double y2)
        {
            var distance1 = CalculateDistanceBetweenPoints(x1, y1, 0, 0);
            var distance2 = CalculateDistanceBetweenPoints(x2, y2, 0, 0);
            if (distance1<distance2)
            {
                return true;
            }
            return false;
        }

        private static double CalculateDistanceBetweenPoints(double x1, double y1, double x2, double y2)
        {
            var distance = Math.Sqrt(Math.Pow(x2-x1, 2) + Math.Pow(y2-y1, 2));
            return distance;
        }
    }
}
