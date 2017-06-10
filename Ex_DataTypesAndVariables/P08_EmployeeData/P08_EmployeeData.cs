using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P08_EmployeeData
{
    class P08_EmployeeData
    {
        static void Main(string[] args)
        {
            string firstName = Console.ReadLine();
            string lastName = Console.ReadLine();
            sbyte age = sbyte.Parse(Console.ReadLine());
            char gender = char.Parse(Console.ReadLine());
            long personalNum = long.Parse(Console.ReadLine());
            int uniqueNum = int.Parse(Console.ReadLine());


            Console.WriteLine($"First name: {firstName}"); 
            Console.WriteLine($"Last name: {lastName}"); 
            Console.WriteLine($"Age: {age}"); 
            Console.WriteLine($"Gender: {gender}");
            Console.WriteLine($"Personal ID: {personalNum}"); 
            Console.WriteLine($"Unique Employee number: {uniqueNum}");
        }
    }
}
