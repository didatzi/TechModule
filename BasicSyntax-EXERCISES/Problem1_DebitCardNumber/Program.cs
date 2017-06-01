using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problem1_DebitCardNumber
{
    class Program
    {
        static void Main(string[] args)
        {
            var firstNum = int.Parse(Console.ReadLine());
            var secondNum = int.Parse(Console.ReadLine());
            var thirdNum = int.Parse(Console.ReadLine());
            var forthNum = int.Parse(Console.ReadLine());

            Console.WriteLine($"{firstNum:D4} {secondNum:D4} {thirdNum:D4} {forthNum:D4}");
        }
    }
}
