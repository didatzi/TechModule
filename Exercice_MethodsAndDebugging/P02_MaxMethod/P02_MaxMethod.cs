using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P02_MaxMethod
{
    class P02_MaxMethod
    {
        static void Main(string[] args)
        {
            int firstNum = int.Parse(Console.ReadLine());
            int secondNum = int.Parse(Console.ReadLine());
            int thirdNum = int.Parse(Console.ReadLine());

            GetMax(firstNum, secondNum, thirdNum);
        }

        static int GetMax(int firstNum, int secondNum, int thirdNum)
        {
            int biggestNum = 0;
            if (firstNum >= secondNum)
            {
                biggestNum = firstNum;
            }
            else if (secondNum >= thirdNum)
            {
                biggestNum = secondNum;
            }
            else if (thirdNum >= firstNum)
            {
                biggestNum = thirdNum; 
            }
            Console.WriteLine(biggestNum);
            return biggestNum;
        }
    }
}
