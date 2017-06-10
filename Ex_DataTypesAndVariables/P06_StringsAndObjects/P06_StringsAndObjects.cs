using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P06_StringsAndObjects
{
    class P06_StringsAndObjects
    {
        static void Main(string[] args)
        {
            string firstText = Console.ReadLine();
            string secondText = Console.ReadLine();
            object fullText = $"{firstText} {secondText}";
            string lastText = (string)fullText;
            Console.WriteLine(lastText);
        }
    }
}
