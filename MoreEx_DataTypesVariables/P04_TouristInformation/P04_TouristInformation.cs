using System;

namespace P04_TouristInformation
{
    class P04_TouristInformation
    {
        static void Main(string[] args)
        {
            string imperialUnit = Console.ReadLine();
            var initialValue = decimal.Parse(Console.ReadLine());
            string metricUnit = string.Empty;
            decimal convertedValue = 1;
            switch (imperialUnit)
            {
                case "miles":
                    metricUnit = "kilometers";
                    convertedValue = initialValue * 1.6m;
                    break;
                case "inches":
                    metricUnit = "centimeters";
                    convertedValue = initialValue * 2.54m;
                    break;
                case "feet":
                    metricUnit = "centimeters";
                    convertedValue = initialValue * 30;
                    break;
                case "yards":
                    metricUnit = "meters";
                    convertedValue = initialValue * 0.91m;
                    break;
                case "gallons":
                    metricUnit = "liters";
                    convertedValue = initialValue * 3.8m;
                    break;
            }
            Console.WriteLine($"{initialValue} {imperialUnit} = {convertedValue:F2} {metricUnit}");
        }
    }
}
