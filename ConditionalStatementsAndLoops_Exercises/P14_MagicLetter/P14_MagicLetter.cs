using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P14_MagicLetter
{
    class P14_MagicLetter
    {
        static void Main(string[] args)
        {
            var firstChar = Console.ReadLine().ToLower().ToCharArray()[0];
            var lastChar = Console.ReadLine().ToLower().ToCharArray()[0];
            var magicChar = Console.ReadLine().ToLower().ToCharArray()[0];

            for (char startChar = firstChar; startChar <= lastChar; startChar++)
            {
                if (startChar == magicChar)
                {
                    continue;
                }
                for (char middleChar = firstChar; middleChar <= lastChar; middleChar++)
                {
                    if (middleChar == magicChar)
                    {
                        continue;
                    }
                for (char endChar = firstChar; endChar <= lastChar; endChar++)
                {
                    if (endChar == magicChar)
                    {
                        continue;
                    }
                    else
                    {
                        Console.Write($"{startChar}{middleChar}{endChar} ");

                    }
                }
                }
            }
        }
    }
}
