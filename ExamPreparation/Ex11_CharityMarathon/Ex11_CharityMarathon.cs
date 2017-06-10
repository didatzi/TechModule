using System;


namespace Ex11_CharityMarathon
{
    class Ex11_CharityMarathon
    {
        static void Main(string[] args)
        {
            short marathonInDays = short.Parse(Console.ReadLine());
            long runnersToParticipate = int.Parse(Console.ReadLine());
            byte avaregeLabPerRunner = byte.Parse(Console.ReadLine());
            int trackLenghtInMetres = int.Parse(Console.ReadLine());
            short trackCapacityPerDay = short.Parse(Console.ReadLine());
            double moneyDonadetPerKm = double.Parse(Console.ReadLine());

            int maximumRunners = trackCapacityPerDay * marathonInDays;
            if (runnersToParticipate >= maximumRunners)
            {
                runnersToParticipate = maximumRunners;
            }
            long totalMeters = runnersToParticipate * avaregeLabPerRunner * trackLenghtInMetres;
            double totalKilometers = totalMeters / 1000d;
            double totalMoney = totalKilometers * moneyDonadetPerKm;

            Console.WriteLine($"Money raised: {totalMoney:F2}");
        }
    }
}
