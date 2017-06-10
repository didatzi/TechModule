using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P01_Hello_Name_
{
    class Program
    {
        static void Main(string[] args)
        {
           string imputName = Console.ReadLine();
           PrintName(imputName);           
        }

         static string PrintName(string name)
        {
            Console.WriteLine($"Hello, {name}!");
            return name;
        }
    }
}
