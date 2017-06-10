using System;
using System.Numerics;

namespace P18_DifferentIntegersSize
{
    class P18_DifferentIntegersSize
    {
        static void Main(string[] args)
        {
            var inputNumber = Console.ReadLine();
            long outNum;
            var canFitInLong = long.TryParse(inputNumber, out outNum);

            if (!canFitInLong)
            {
                Console.WriteLine($"{inputNumber} can't fit in any type");
            }
            else
            {
                Console.WriteLine($"{outNum} can fit in:");
                if (outNum >= sbyte.MinValue && outNum <= sbyte.MaxValue)
                {

                    Console.WriteLine($"* sbyte");
                }
                if (outNum >= byte.MinValue && outNum <= byte.MaxValue)
                {
                    Console.WriteLine($"* byte");
                }
                if (outNum >= short.MinValue && outNum <= short.MaxValue)
                {
                    Console.WriteLine($"* short");
                }
                if (outNum >= ushort.MinValue && outNum <= ushort.MaxValue)
                {
                    Console.WriteLine($"* ushort");
                }
                if (outNum >= int.MinValue && outNum <= int.MaxValue)
                {
                    Console.WriteLine($"* int");
                }
                if (outNum >= uint.MinValue && outNum <= uint.MaxValue)
                {
                    Console.WriteLine($"* uint");
                }
                if (outNum >= long.MinValue && outNum <= long.MaxValue)
                {
                    Console.WriteLine($"* long");
                }
            }
        }
    }
}
