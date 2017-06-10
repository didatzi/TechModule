using System;


namespace P02_NumberChecker
{
    class P02_NumberChecker
    {
        static void Main(string[] args)
        {
            string toNumber = Console.ReadLine();
            //decimal num = Convert.ToDecimal(toNumber);
            if (toNumber.Contains(".") )
            {
                Console.WriteLine("floating-point");
            }
            else
            {
                Console.WriteLine("integer");
            }
        }
    }
}
