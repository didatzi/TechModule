using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P08_CaloriesCounter
{
    class P08_CaloriesCounter
    {
        static void Main(string[] args)
        {
            var num = int.Parse(Console.ReadLine());
            var sumCalories = 0;
            var counter = 0;
            for (int i = 0; i < num; i++)
            {
                var ingredient = Console.ReadLine().ToLower();
                switch (ingredient)
                {
                    case "cheese":
                        sumCalories += 500;
                      
                        break;
                    case "tomato sauce":
                        sumCalories += 150;
                        break;
                    case "salami":
                        sumCalories += 600;
                        break;
                    case "pepper":
                        sumCalories += 50;
                        break;
                    default:
                        break;
                }
            }
                Console.WriteLine($"Total calories: {sumCalories}");
        }
    }
}
