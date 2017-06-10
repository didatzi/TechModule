using System;

namespace P11_StringConcatenation
{
    class P11_StringConcatenation
    {
        static void Main(string[] args)
        {
            char delimeter = char.Parse(Console.ReadLine());
            string evenOdd = Console.ReadLine().ToLower();
            int num = int.Parse(Console.ReadLine());

            string message = string.Empty;
            int result = 0;
            if (evenOdd == "odd")
            {
                result = 1;
            }
            for (int i = 1; i <= num; i++)
            {
                string words = Console.ReadLine();
                if (i%2==result)
                {
                    message = message + words + delimeter;
                }
                           
            }
            Console.WriteLine(message.Remove(message.Length -1));
        }
    }
}
