using System;

namespace P06_CatchTheThief
{
    class P06_CatchTheThief
    {
        static void Main(string[] args)
        {

            string idNumType = Console.ReadLine();
            int countOfId = int.Parse(Console.ReadLine());
            long tempNumber = long.MinValue;
            long maxNumber = long.MinValue;
            for (int i = 0; i < countOfId; i++)
            {
                long ids = long.Parse(Console.ReadLine());
                switch (idNumType)
                {
                    case "sbyte":
                        if (ids >= sbyte.MinValue && ids <= sbyte.MaxValue)
                        {
                            tempNumber = ids;
                            if (tempNumber >= maxNumber)
                            {
                                maxNumber = tempNumber;
                            }
                        }
                        break;
                    case "int":
                        if (ids >= int.MinValue && ids <= int.MaxValue)
                        {
                            tempNumber = ids;
                            if (tempNumber >= maxNumber)
                            {
                                maxNumber = tempNumber;
                            }
                        }
                        break;
                    case "long":
                        if (ids >= long.MinValue && ids <= long.MaxValue)
                        {
                            tempNumber = ids;
                            if (tempNumber >= maxNumber)
                            {
                                maxNumber = tempNumber;
                            }
                        }
                        break;

                }
            }
            Console.WriteLine(maxNumber);
        }
    }
}
