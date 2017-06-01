using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P04_PhotoGallery
{
    class P04_PhotoGallery
    {
        static void Main(string[] args)
        {
            var number = int.Parse(Console.ReadLine());
            var day = int.Parse(Console.ReadLine());
            var month = int.Parse(Console.ReadLine());
            var year = int.Parse(Console.ReadLine());
            var hours = int.Parse(Console.ReadLine());
            var minutes = int.Parse(Console.ReadLine());
            var bytes = int.Parse(Console.ReadLine());
            var resolutionWidth = int.Parse(Console.ReadLine());
            var resolutionHeight = int.Parse(Console.ReadLine());
           
           

            Console.WriteLine($"Name: DSC_{number:D4}.jpg");
            Console.WriteLine($"Date Taken: {day:D2}/{month:D2}/{year} {hours:D2}:{minutes:D2}");
            if (bytes<1000)
            {
                Console.WriteLine($"Size: {bytes}B");
            }
            else if(bytes >= 1000 && bytes<1000000)
            {
                Console.WriteLine($"Size: {bytes/1000}KB");
            }
            else
            {
                Console.WriteLine($"Size: {Math.Round(bytes/1000000.0, 1)}MB");
            }
       

            if (resolutionWidth>resolutionHeight)
            {
                Console.WriteLine($"Resolution: {resolutionWidth}x{resolutionHeight} (landscape)");
            }
            else if (resolutionWidth<resolutionHeight)
            {
                Console.WriteLine($"Resolution: {resolutionWidth}x{resolutionHeight} (portrait)");
            }
            else
            {
                Console.WriteLine($"Resolution: {resolutionWidth}x{resolutionHeight} (square)");
            }
            
        }
    }
}
