using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P01_X
{
    class P01_X
    {
        static void Main(string[] args)
        {
            var n = int.Parse(Console.ReadLine());

            for (int i = 1; i < n; i+=2)
            {
                Console.WriteLine(new string(' ',i/2)+"x"+new string(' ',((n-1)-i))+"x");
            }
            Console.WriteLine(new string(' ', n / 2) + "x" + new string(' ', n / 2));
            for (int i = 2; i <= n; i+=2)
            {
                Console.WriteLine(new string(' ',(n-i)/2)+"x"+ new string(' ', (i-1))+"x");
            }

        }
    }
}
