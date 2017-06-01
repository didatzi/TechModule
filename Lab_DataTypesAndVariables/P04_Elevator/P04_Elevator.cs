using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P04_Elevator
{
    class P04_Elevator
    {
        static void Main(string[] args)
        {
            int people = int.Parse(Console.ReadLine());
            int capacityElevator = int.Parse(Console.ReadLine());
            double courses = Math.Ceiling((double)people / capacityElevator);
            Console.WriteLine(courses);
        }
    }
}
