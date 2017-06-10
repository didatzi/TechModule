using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P15_DebuggingExerciseSubstring
{
    class P15_DebuggingExerciseSubstring
    {
        static void Main(string[] args)
        {
            string text = Console.ReadLine();
            int jump = int.Parse(Console.ReadLine());

            bool hasMatch = false;

            for (int startIndex = 0; startIndex < text.Length; startIndex++)
            {

                if (text[startIndex] == 'p')
                {
                    hasMatch = true;
                    int endIndex = 1 + jump;
                    if (endIndex + startIndex > text.Length)
                    {
                        endIndex = text.Length - startIndex;
                    }
                    string matchedString = text.Substring(startIndex, endIndex);
                    Console.WriteLine(matchedString);
                    startIndex += endIndex - 1;
                }
            }
            if (!hasMatch)
            {
                Console.WriteLine("no");
            }

        }
    }
}
