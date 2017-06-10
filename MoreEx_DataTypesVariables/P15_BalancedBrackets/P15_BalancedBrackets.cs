using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P15_BalancedBrackets
{
    class P15_BalancedBrackets
    {
        static void Main(string[] args)
        {
            int lines = int.Parse(Console.ReadLine());
            int openBracket = 0;
            int closeBracket = 0;
            bool isLocked = false;
            for (int i = 1; i <= lines; i++)
            {
                string input = Console.ReadLine();
                if (input == "(")
                {
                    openBracket++;
                }
                else if (input == ")")
                {
                    closeBracket++;
                }
                if (!(openBracket == closeBracket || openBracket==closeBracket+1))
                {
                    isLocked = true;

                }
            }
            bool isBalanced = openBracket == closeBracket;
            Console.WriteLine(isBalanced && !isLocked ? "BALANCED" : "UNBALANCED");
        }

    }
}
