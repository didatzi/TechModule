using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P10_CenturiesToNanoseconds
{
    class P10_CenturiesToNanoseconds
    {
        static void Main(string[] args)
        {
            var centuries = decimal.Parse(Console.ReadLine());
            var years = centuries * 100;
            var days = Math.Floor(years * 365.2422m);
            var hours = days * 24;
            var minutes = hours * 60;
            var seconds = minutes * 60;
            var miliseconds = seconds * 1000;
            var microseconds = miliseconds * 1000;
            var nanoseconds = microseconds * 1000;
            Console.WriteLine("{0} centuries = {1} years = {2} days = {3} hours = {4} minutes = {5} seconds = " +
                "{6} milliseconds = {7} microseconds = {8} nanoseconds", 
                centuries, years, days, hours, minutes, seconds, miliseconds, microseconds, nanoseconds);
         }
    }
}
