using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P05_BooleanVariable
{
    class P05_BooleanVariable
    {
        static void Main(string[] args)
        {
            string text = Console.ReadLine();
            bool toBoolean = Convert.ToBoolean(text);
            if (toBoolean==true)
            {
            Console.WriteLine("Yes");
            }
            else
            {
                Console.WriteLine("No");
            }
          
            } 
    }
}
