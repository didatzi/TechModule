using System;

namespace Ex01_SinoTheWalker
{
    class Ex01_SinoTheWalker
    {
        static void Main(string[] args)
        {
            TimeSpan startTime = TimeSpan.Parse(Console.ReadLine());
            int numOfSteps = int.Parse(Console.ReadLine())%86400; //if the input is more than 1 day %86400
            int timeInSecForStep = int.Parse(Console.ReadLine())%86400; //if the input is more than 1 day %86400
            long totalSec = numOfSteps * timeInSecForStep;
            var endTime = startTime.TotalSeconds + totalSec;

            var time = TimeSpan.FromSeconds(endTime);
            Console.WriteLine("Time Arrival: {0}", time.ToString("hh\\:mm\\:ss"));

        }       
    }
}
