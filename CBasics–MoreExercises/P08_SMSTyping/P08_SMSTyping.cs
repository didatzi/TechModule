using System;

namespace P08_SMSTyping
{
    class P08_SMSTyping
    {
        static void Main(string[] args)
        {
            int numOfChar = int.Parse(Console.ReadLine());
            string message = String.Empty;
            int toDigit = 48;
            for (int i = 0; i < numOfChar; i++)
            {
                string digits = Console.ReadLine();
                int mainDigit = int.Parse(digits[0].ToString());
                int offset = (mainDigit - 2) * 3;
                if (mainDigit == 8 || mainDigit == 9)
                {
                    offset += 1;
                }
                int letterIndex = offset + digits.Length - 1;
               

                if (mainDigit == 0)
                {
                    message += " ";
                }
                else
                {
                    message += (char)(97 + letterIndex);
                }
            }
            Console.WriteLine(message);
        }
    }
}
