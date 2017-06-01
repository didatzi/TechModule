using System;


namespace Problem12_NumberChecker
{
    class Problem12_NumberChecker
    {
        static void Main(string[] args)
        {
            try
            {
                var number = Math.Abs(int.Parse(Console.ReadLine()));
               
                    Console.WriteLine("It is a number.");
         
               }
            catch (Exception)
            {
                Console.WriteLine("Invalid input!");
            }
        }
    }
}
