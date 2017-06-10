using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P11_Geometry_Calculator
{
    class Program
    {
        static void Main(string[] args)
        {
            string figure = Console.ReadLine().ToLower();
            double area = 0.0;
            switch (figure)
            {
                case "triangle":
                    area = TriangleArea(area);
                    break;
                case "square":
                    area = SquareArea(area);
                    break;
                case "rectangle":
                    area = RectangleArea(area);
                    break;
                case "circle":
                    area = CircleArea(area);
                    break;
            }
            Console.WriteLine($"{area:F2}");
        }

        private static double CircleArea(double area)
        {
            double radius = double.Parse(Console.ReadLine());

            area = Math.PI * Math.Pow(radius, 2);
            return area;
        }

        private static double RectangleArea(double area)
        {
            double width = double.Parse(Console.ReadLine());
            double height = double.Parse(Console.ReadLine());

            area = width * height;
            return area;
        }

        private static double SquareArea(double area)
        {
            double side = double.Parse(Console.ReadLine());
            area = side * side;
            return area;
        }

        private static double TriangleArea(double area)
        {
            double side = double.Parse(Console.ReadLine());
            double height = double.Parse(Console.ReadLine());

            area = side * height / 2.0;
            return area;
        }
    }
}
