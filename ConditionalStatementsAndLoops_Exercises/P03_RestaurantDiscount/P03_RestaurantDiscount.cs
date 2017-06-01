using System;
namespace P03_RestaurantDiscount
{
    class P03_RestaurantDiscount
    {
        static void Main(string[] args)
        {
            var groupSize = int.Parse(Console.ReadLine());
            var package = Console.ReadLine();
            var hallPrice = 0;
            var price = 0;
            var totlaPrice = 1;
            var pricePerPerson = 0d;
            var discount = 0d;


            if (groupSize > 0 && groupSize <= 50)
            { 
                hallPrice = 2500;
                if (package == "Normal")
                {
                    price = 500;
                    totlaPrice = hallPrice + price;
                    discount = totlaPrice - 0.05 * totlaPrice;
                   
                }
                else if (package == "Gold")
                {
                    price = 750;
                    totlaPrice = hallPrice + price;
                    discount = totlaPrice - 0.1 * totlaPrice;
                 
                }
                else if (package == "Platinum")
                {
                    price = 1000;
                    totlaPrice = hallPrice + price;
                    discount = totlaPrice - 0.15 * totlaPrice;
                   
                }
                pricePerPerson = discount / groupSize;
                Console.WriteLine("We can offer you the Small Hall");
                Console.WriteLine($"The price per person is {pricePerPerson:F2}$");
            }
            else if (groupSize > 50 && groupSize <= 100)
            {
               hallPrice = 5000;
                if (package == "Normal")
                {
                    price = 500;
                    totlaPrice = hallPrice + price;
                    discount = totlaPrice - 0.05 * totlaPrice;

                }
                else if (package == "Gold")
                {
                    price = 750;
                    totlaPrice = hallPrice + price;
                    discount = totlaPrice - 0.1 * totlaPrice;

                }
                else if (package == "Platinum")
                {
                    price = 1000;
                    totlaPrice = hallPrice + price;
                    discount = totlaPrice - 0.15 * totlaPrice;

                }
                pricePerPerson = discount / groupSize;
                Console.WriteLine("We can offer you the Terrace");
                Console.WriteLine($"The price per person is {pricePerPerson:F2}$");
            }
            else if (groupSize > 100 && groupSize <= 120)
            {
                hallPrice = 7500;
                if (package == "Normal")
                {
                    price = 500;
                    totlaPrice = hallPrice + price;
                    discount = totlaPrice - 0.05 * totlaPrice;

                }
                else if (package == "Gold")
                {
                    price = 750;
                    totlaPrice = hallPrice + price;
                    discount = totlaPrice - 0.1 * totlaPrice;

                }
                else if (package == "Platinum")
                {
                    price = 1000;
                    totlaPrice = hallPrice + price;
                    discount = totlaPrice - 0.15 * totlaPrice;

                }
                pricePerPerson = discount / groupSize;
                Console.WriteLine("We can offer you the Great Hall");
                Console.WriteLine($"The price per person is {pricePerPerson:F2}$");
            }
            else
            {
                Console.WriteLine("We do not have an appropriate hall.");
            }
          
        }
    }
}
