using System;

namespace P07_GreaterOfTwoValues
{
    class P07_GreaterOfTwoValues
    {
        static void Main(string[] args)
        {
            Console.WriteLine(GetMax(5,6));
            Console.WriteLine(GetMax('a','v'));
        }
        static int GetMax(int a, int b)
        {
            return Math.Max(a, b);
        }
        static char GetMax(char a, char b)
        {
            return (char)Math.Max(a, b);
        }
    }
}
