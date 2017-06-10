using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P10_Cube_Properties
{
    class Program
    {
        static void Main(string[] args)
        {
            double sideCube = double.Parse(Console.ReadLine());
            string propertiesOfCube = Console.ReadLine().ToLower();

            switch (propertiesOfCube)
            {
                case "face":
                    FaceDiagonal(sideCube);
                    break;
                case "space":
                    SpaceDiagonal(sideCube);
                    break;
                case "volume":
                    VolumeCube(sideCube);
                    break;
                case "area":
                    SurfaceAreaCube(sideCube);
                    break;
            }
        }

        private static double SurfaceAreaCube(double sideCube)
        {
            double area = Math.Pow(sideCube, 2) * 6;
            Console.WriteLine($"{area:F2}");
            return area;
        }

        private static double VolumeCube(double sideCube)
        {
            double volume = Math.Pow(sideCube, 3);
            Console.WriteLine($"{volume:F2}");
            return volume;
        }

        private static double SpaceDiagonal(double sideCube)
        {
            double spaceDiagonal = Math.Sqrt(3 * Math.Pow(sideCube, 2));
            Console.WriteLine($"{spaceDiagonal:F2}");
            return spaceDiagonal;
        }

        private static double FaceDiagonal(double sideCube)
        {
            double faceDiagonal = Math.Sqrt(2 * Math.Pow(sideCube, 2));
            Console.WriteLine($"{faceDiagonal:F2}");
            return faceDiagonal;
        }
    }
}
