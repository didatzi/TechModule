using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P07_CakeIngredients
{
    class P07_CakeIngredients
    {
        static void Main(string[] args)
        {
            var ingredients = Console.ReadLine();
            var ingredientCounter = 0;
            while (ingredients != "Bake!")
            {
                Console.WriteLine($"Adding ingredient {ingredients}.");
                ingredients = Console.ReadLine();
                ingredientCounter++;
            }
            Console.WriteLine($"Preparing cake with {ingredientCounter} ingredients.");
        }
    }
}
