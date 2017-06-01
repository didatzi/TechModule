using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P09_CountTheIntegers
{
    class P09_CountTheIntegers
    {
        static void Main(string[] args)
        {
            var counter = 0;
            try
            {
                while (true)
                {
                var intNumber = int.Parse(Console.ReadLine());
                counter++;

                }
            }
            catch (Exception)
            {
                Console.WriteLine(counter);
            }
        }
    }
}
