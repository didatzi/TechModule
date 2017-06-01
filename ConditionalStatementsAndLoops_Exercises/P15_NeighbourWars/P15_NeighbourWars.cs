using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P15_NeighbourWars
{
    class P15_NeighbourWars
    {
        static void Main(string[] args)
        {
            int peshoDamage = int.Parse(Console.ReadLine());
            int goshoDamage = int.Parse(Console.ReadLine());

            int peshoHealth = 100;
            int goshoHealth = 100;
            int roundCount = 0;
            string player = "Pesho";


            for (int round = 1; round <= 100; round++)
            {
                roundCount++;
                if (round % 2 == 0)
                {
                    player = "Gosho";
                    peshoHealth -= goshoDamage;
                    if (peshoHealth <=0 )
                    {
                        Console.WriteLine($"{player} won in {roundCount}th round.");
                        return;
                    }
                    else
                    {
                    Console.WriteLine($"{player} used Thunderous fist and reduced Pesho to {peshoHealth} health.");
                    }
                }
                else
                {
                    player = "Pesho";
                    goshoHealth -= peshoDamage;
                    if (goshoHealth <= 0)
                    {
                        Console.WriteLine($"{player} won in {roundCount}th round.");
                        return;
                    }
                    else
                    {
                        Console.WriteLine($"{player} used Roundhouse kick and reduced Gosho to {goshoHealth} health.");
                    }
                }
                if (round % 3 == 0)
                {
                    peshoHealth += 10;
                    goshoHealth += 10;
                }
               
            }
        }
    }
}
