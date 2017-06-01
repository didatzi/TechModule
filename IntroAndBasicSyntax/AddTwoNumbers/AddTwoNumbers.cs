using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AddTwoNumbers
{
    class AddTwoNumbers
    {
        static void Main(string[] args)
        {
            var firstNum = int.Parse(Console.ReadLine());
            var secondNum = int.Parse(Console.ReadLine());
            var sum = firstNum + secondNum;
            Console.WriteLine($"{firstNum} + {secondNum} = {sum}");
        }
    }
}
