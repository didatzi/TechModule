using System;


namespace P12_beerKegs
{
    class P12_beerKegs
    {
        static void Main(string[] args)
        {
            int kegs = int.Parse(Console.ReadLine());
            string biggestKeg = string.Empty;
            double biggestVol = 0d;
            for (int i = 0; i < kegs; i++)
            {
                string model = Console.ReadLine();
                double radius = double.Parse(Console.ReadLine());
                int height = int.Parse(Console.ReadLine());
                double volume = Math.PI * ((radius * radius) * height);
                if (volume > biggestVol)
                {
                    biggestKeg = model;
                    biggestVol = volume;
                }
            }
            Console.WriteLine(biggestKeg);

        }
    }
}
