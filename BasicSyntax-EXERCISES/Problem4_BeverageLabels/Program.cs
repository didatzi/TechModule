using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problem4_BeverageLabels
{
    class Program
    {
        static void Main(string[] args)
        {
            var name = Console.ReadLine();
            var volume = int.Parse(Console.ReadLine());
            decimal energyPer100ml = decimal.Parse(Console.ReadLine());
            decimal sugarPer100ml = decimal.Parse(Console.ReadLine());

            var energyContent = volume * energyPer100ml / 100;
            var sugarContent = volume * sugarPer100ml / 100;

            Console.WriteLine($"{volume}ml {name}:\n{energyContent}kcal, {sugarContent}g sugars");
        }
    }
}
