using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P07_Greeting
{
    class P07_Greeting
    {
        static void Main(string[] args)
        {
            string firstName = Console.ReadLine();
            string lastName = Console.ReadLine();
            byte age = byte.Parse(Console.ReadLine());
            Console.WriteLine($"Hello, {firstName} {lastName}.\nYou are {age} years old.");
        }
    }
}
