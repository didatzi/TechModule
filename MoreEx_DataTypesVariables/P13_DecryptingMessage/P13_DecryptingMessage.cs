using System;

namespace P13_DecryptingMessage
{
    class P13_DecryptingMessage
    {
        static void Main(string[] args)
        {
            int key = int.Parse(Console.ReadLine());
            int number = int.Parse(Console.ReadLine());
            string message = string.Empty;
                int tempChar = 0;
            for (int i = 0; i < number; i++)
            {
                char alfabetChar = char.Parse(Console.ReadLine());
                tempChar = alfabetChar + key;
                message = message + (char)tempChar;
            }
            Console.WriteLine(message);
        }
    }
}
