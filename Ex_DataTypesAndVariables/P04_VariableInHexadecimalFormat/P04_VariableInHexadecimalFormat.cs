using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P04_VariableInHexadecimalFormat
{
    class P04_VariableInHexadecimalFormat
    {
        static void Main(string[] args)
        {
            string hexValue = Console.ReadLine();
            int number = Convert.ToInt32(hexValue, 16);

            Console.WriteLine(number);

        }
    }
}
