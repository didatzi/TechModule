using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problem3_BackIn30Minutes
{
    class Problem3_BackIn30Minutes
    {
        static void Main(string[] args)
        {
            var hours = int.Parse(Console.ReadLine());
            var minutes = int.Parse(Console.ReadLine());

            var after30minutes = minutes + 30;
            if (after30minutes>59)
            {
               hours++;
                if (hours>23)
                {
                    hours = 0;
                }
                after30minutes = after30minutes % 60;
                Console.WriteLine($"{hours}:{after30minutes:d2}");
            }
            else
            {
                Console.WriteLine($"{hours}:{after30minutes:d2}");
            }
           
        }
    }
}
