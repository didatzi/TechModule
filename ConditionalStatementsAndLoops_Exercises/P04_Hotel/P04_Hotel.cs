using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P04_Hotel
{
    class P04_Hotel
    {
        static void Main(string[] args)
        {
            var month = Console.ReadLine();
            var nights = int.Parse(Console.ReadLine());

            var priceStudio = 1d;
            var priceDouble = 1d;
            var priceSuite = 1d;
 

            switch (month)
            {
                case "May":
                case "October":
                    priceStudio = 50;
                    priceDouble = 65;
                    priceSuite = 75;
                    if (nights > 7)
                    {
                        priceStudio *= 0.95;
                    }
                    break;
                case "June":
                case "September":
                    priceStudio = 60;
                    priceDouble = 72;
                    priceSuite = 82;
                    if (nights > 14)
                    {
                        priceDouble *= 0.90;
                    }
                    break;
                case "July":
                case "August":
                case "December":
                    priceStudio = 68;
                    priceDouble = 77;
                    priceSuite  = 89;
                    if (nights > 14)
                    {
                        priceSuite *= 0.85;
                    }
                    break;
            }
            var endpriceStudio = priceStudio * nights;
            var endpriceDouble = priceDouble * nights;
            var endpriceSuite = priceSuite * nights;

            if ((month == "September" || month == "October") && nights > 7)
            {
                endpriceStudio -= priceStudio;
            }
            Console.WriteLine($"Studio: {endpriceStudio:F2} lv.");
            Console.WriteLine($"Double: {endpriceDouble:F2} lv.");
            Console.WriteLine($"Suite: {endpriceSuite:F2} lv.");
        }
    }
}
