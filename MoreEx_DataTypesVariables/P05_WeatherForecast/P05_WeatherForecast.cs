using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P05_WeatherForecast
{
    class P05_WeatherForecast
    {
        static void Main(string[] args)
        {
            string number = Console.ReadLine();
            
            if (number.Contains("."))
            {
                Console.WriteLine("Rainy");
            }
            else
            {
                long weather = Convert.ToInt64(number); 
                if (weather>=sbyte.MinValue && weather<=sbyte.MaxValue)
                {
                    Console.WriteLine("Sunny");
                }
                else if (weather >= int.MinValue && weather <= int.MaxValue)
                {
                    Console.WriteLine("Cloudy");
                }
                else if (weather >= long.MinValue && weather <= long.MaxValue)
                {
                    Console.WriteLine("Windy");
                }
               
            }

        }
    }
}
