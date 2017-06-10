using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P19_TheaThePhotographer
{
    class Program
    {
        static void Main(string[] args)
        {
            int numOfPictures = int.Parse(Console.ReadLine());
            int filterTimeInSec = int.Parse(Console.ReadLine());
            int filterPercentige = int.Parse(Console.ReadLine());
            int timeNeedToUpload = int.Parse(Console.ReadLine());

            long totalFilterPicInSec = (long)numOfPictures * filterTimeInSec;
            long usefulPictures = (long)Math.Ceiling(numOfPictures * (filterPercentige / 100d));
            long uploadPictures = usefulPictures * timeNeedToUpload;
            long totalTime = totalFilterPicInSec + uploadPictures;

            var time = TimeSpan.FromSeconds(totalTime);
            Console.WriteLine(time.ToString(@"d\:hh\:mm\:ss"));

         }
    }
}
