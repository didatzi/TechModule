using System;

namespace P07_SentenceTheThief
{
    class P07_SentenceTheThief
    {
        static void Main(string[] args)
        {
            string idNumType = Console.ReadLine();
            long maxValue = 0L;
            switch (idNumType)
            {
                case "sbyte":
                    maxValue = sbyte.MaxValue;
                    break;
                case "int":
                    maxValue = int.MaxValue;
                    break;
                case "long":
                    maxValue = long.MaxValue;
                    break;
            }
            int countOfId = int.Parse(Console.ReadLine());
            long thiefsId = long.MinValue;
            for (int i = 0; i < countOfId; i++)
            {
                long ids = long.Parse(Console.ReadLine());
                if (ids > thiefsId && ids <= maxValue)
                {
                    thiefsId = ids;
                }
            }
            double num = 0;
            if (thiefsId<0)
            {
                num = sbyte.MinValue;
            }
            else
            {
                num = sbyte.MaxValue;
            }
            double yearsInPrison = Math.Ceiling(thiefsId / num);
          
            Console.WriteLine("Prisoner with id {0} is sentenced to {1} {2}", thiefsId,yearsInPrison, yearsInPrison>1 ? "years":"year");
           
        }
    }
}
