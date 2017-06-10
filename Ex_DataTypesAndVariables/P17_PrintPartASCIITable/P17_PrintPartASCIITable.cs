using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P17_PrintPartASCIITable
{
    class P17_PrintPartASCIITable
    {
        static void Main(string[] args)
        {
            int startIndex = int.Parse(Console.ReadLine());
            int endIndex = int.Parse(Console.ReadLine());
            for (char @char = (char)startIndex; @char <= endIndex; @char++)
            {
                Console.Write(@char + " ");
            }
        }
    }
}
