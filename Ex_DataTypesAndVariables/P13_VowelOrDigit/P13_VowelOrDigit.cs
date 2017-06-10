using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P13_VowelOrDigit
{
    class P13_VowelOrDigit
    {
        static void Main(string[] args)
        {
            char symbol = Convert.ToChar(Console.ReadLine());
            
            switch (symbol)
            {
               case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    Console.WriteLine("vowel");
                    return;
               }
            if (symbol>='0' && symbol<='9')
            {
                Console.WriteLine("digit");
            }
            else
            {
                Console.WriteLine("other");
            }
        }
    }
}
