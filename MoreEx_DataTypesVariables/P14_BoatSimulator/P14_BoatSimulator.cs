using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P14_BoatSimulator
{
    class P14_BoatSimulator
    {
        static void Main(string[] args)
        {
            char charForFirstBoat = char.Parse(Console.ReadLine());
            char charForSecondBoat = char.Parse(Console.ReadLine());
            int num = int.Parse(Console.ReadLine());
            double speedFirstBoat = 0d;
            double speedSecondBoat = 0d;
            for (int i = 1; i <= num; i++)
            {
                string word = Console.ReadLine();
                if (word == "UPGRADE")
                {
                    charForFirstBoat = (char)(charForFirstBoat + 3);
                    charForSecondBoat = (char)(charForSecondBoat + 3);
                    continue;
                }
                if (i % 2 == 0)
                {
                    speedSecondBoat = speedSecondBoat + word.Length;
                }
                else
                {
                    speedFirstBoat = speedFirstBoat + word.Length;
                }
                if (speedFirstBoat >= 50)
                {
                    Console.WriteLine(charForFirstBoat);
                    return;
                }
                else if (speedSecondBoat >= 50)
                {
                    Console.WriteLine(charForSecondBoat);
                    return;
                }
            }
        
            Console.WriteLine(speedFirstBoat > speedSecondBoat ? charForFirstBoat : charForSecondBoat);
           
        }
    }
}
