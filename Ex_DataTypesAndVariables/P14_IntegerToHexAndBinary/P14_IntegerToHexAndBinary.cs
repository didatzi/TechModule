using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P14_IntegerToHexAndBinary
{
    class P14_IntegerToHexAndBinary
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());
            string toHex = Convert.ToString(number, 16).ToUpper();
            string toBinary = Convert.ToString(number, 2);

            Console.WriteLine(toHex);
            Console.WriteLine(toBinary);
           
        }
    }
}
