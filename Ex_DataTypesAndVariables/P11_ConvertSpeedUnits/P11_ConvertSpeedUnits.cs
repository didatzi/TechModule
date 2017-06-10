using System;

namespace P11_ConvertSpeedUnits
{
    class P11_ConvertSpeedUnits
    {
        static void Main(string[] args)
        {
            var distansInMeters = int.Parse(Console.ReadLine());
            var hours = float.Parse(Console.ReadLine());
            var minutes = float.Parse(Console.ReadLine());
            var seconds = float.Parse(Console.ReadLine());

            var totalSeconds = seconds + minutes * 60 + (hours * 60 * 60);
            var metersPerSeconds = distansInMeters / totalSeconds;
            var kilometersPerHour = (distansInMeters / 1000) / (totalSeconds / 60 /60 );
            var milesPerHour = (distansInMeters / 1609f) / (totalSeconds / 60 /60);

            Console.WriteLine(metersPerSeconds);
            Console.WriteLine(kilometersPerHour);
            Console.WriteLine(milesPerHour);
        }
    }
}
