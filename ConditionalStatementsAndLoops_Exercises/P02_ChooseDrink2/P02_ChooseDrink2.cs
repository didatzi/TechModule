using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P02_ChooseDrink2
{
    class P02_ChooseDrink2
    {
        static void Main(string[] args)
        {
            string profession = Console.ReadLine();
            var quantity = int.Parse(Console.ReadLine());
            var totalPrice = 1d;

            switch (profession)
            {
                case "Athlete":
                    totalPrice = quantity * 0.70;
                    Console.WriteLine($"The {profession} has to pay {totalPrice:f2}.");
                    break;
                case "Businessman":
                case "Businesswoman":
                    totalPrice = quantity * 1.00;
                    Console.WriteLine($"The {profession} has to pay {totalPrice:f2}.");
                    break;
                case "SoftUni Student":
                    totalPrice = quantity * 1.70;
                    Console.WriteLine($"The {profession} has to pay {totalPrice:f2}.");
                    break;

                default:
                    totalPrice = quantity * 1.20;
                    Console.WriteLine($"The {profession} has to pay {totalPrice:f2}.");
                    break;
            }
        }
    }
}
