using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P07_TrainingHallEquipment
{
    class P07_TrainingHallEquipment
    {
        static void Main(string[] args)
        {
            double budget = double.Parse(Console.ReadLine());
            int numberItems = int.Parse(Console.ReadLine());
            double subtotal = 0;
            for (int i = 0; i < numberItems; i++)
            {
                string nameItem = Console.ReadLine();
                double itemPrice = double.Parse(Console.ReadLine());
                int itemsCount = int.Parse(Console.ReadLine());

                subtotal = subtotal + itemPrice * itemsCount;
                if (itemsCount != 1)
                {
                    Console.WriteLine($"Adding {itemsCount} {nameItem}s to cart.");
                }
                else
                {
                    Console.WriteLine($"Adding {itemsCount} {nameItem} to cart.");
                }

            }
            Console.WriteLine($"Subtotal: ${subtotal:F2}");
            if (subtotal > budget)
            {
                Console.WriteLine($"Not enough. We need ${(subtotal - budget):f2} more.");
            }
            else
            {
                Console.WriteLine($"Money left: ${(budget - subtotal):F2}");
            }
        }
    }
}
