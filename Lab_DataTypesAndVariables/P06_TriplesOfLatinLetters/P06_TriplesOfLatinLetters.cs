using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P06_TriplesOfLatinLetters
{
    class P06_TriplesOfLatinLetters
    {
        static void Main(string[] args)
        {
            int numToIncreaseLetters = int.Parse(Console.ReadLine());
            char incrisedLetter = (char)(numToIncreaseLetters + 'a');
            for (char firstLetter = 'a'; firstLetter < incrisedLetter; firstLetter++)
            {
                for (char secondLetter = 'a'; secondLetter < incrisedLetter; secondLetter++)
                {
                    for (char thirdLetter = 'a'; thirdLetter < incrisedLetter; thirdLetter++)
                    {
                        Console.WriteLine($"{firstLetter}{secondLetter}{thirdLetter}");
                    }
                }
            }
        }
    }
}
