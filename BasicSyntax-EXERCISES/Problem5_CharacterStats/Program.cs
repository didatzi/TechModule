using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problem5_CharacterStats
{
    class Program
    {
        static void Main(string[] args)
        {
            string name = Console.ReadLine();
            int curentHealth = int.Parse(Console.ReadLine());
            int maximumHealth = int.Parse(Console.ReadLine());
            int curentEnergy = int.Parse(Console.ReadLine());
            int maximumEnergy = int.Parse(Console.ReadLine());

            string health = "|" + new string('|', curentHealth) + new string('.', maximumHealth - curentHealth) + "|";
            string energy = "|" + new string('|', curentEnergy) + new string('.', maximumEnergy - curentEnergy) + "|";

            Console.WriteLine($"Name: {name} \nHealth: {health}\nEnergy: {energy}");
        }
    }
}
