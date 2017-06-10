using System;

namespace P09__MakeAWord
{
    class Program
    {
        static void Main(string[] args)
        {
            int lines = int.Parse(Console.ReadLine());
            string message = string.Empty;
            for (int i = 0; i < lines; i++)
            {
                char alfabet = char.Parse(Console.ReadLine());
                message += alfabet;
            }
            Console.WriteLine($"The word is: {message}");
        }
    }
}
