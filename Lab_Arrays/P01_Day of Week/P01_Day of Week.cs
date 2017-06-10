﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P01_Day_of_Week
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] daysName = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
            int dayNum = int.Parse(Console.ReadLine());

            if (dayNum >= 1 && dayNum <= 7)
            {
                Console.WriteLine(daysName[dayNum - 1]);
            }
            else
            {
                Console.WriteLine("Invalid day!");
            }
        }
    }
}
