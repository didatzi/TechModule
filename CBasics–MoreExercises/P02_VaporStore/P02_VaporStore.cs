using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P02_VaporStore
{
    class P02_VaporStore
    {
        static void Main(string[] args)
        {
            var currentBalance = double.Parse(Console.ReadLine());
            var game = "";

            var remainBalance = currentBalance;
            var spend = 0d;
            var outFall = 39.99;
            var csOG = 15.99;
            var zplinterZell = 19.99;
            var honored2 = 59.99;
            var roverWatch = 29.99;
            var roverWatchOE = 39.99;


            while (game != "Game Time")
            {
                game = Console.ReadLine();
               switch (game)
                 {
                    case "OutFall 4":
                    case "RoverWatch Origins Edition":
                        if (roverWatchOE > remainBalance)
                        {
                            Console.WriteLine("Too Expensive");
                        }
                        else
                        {
                            remainBalance -= outFall;
                            spend += outFall;
                            Console.WriteLine($"Bought {game}");
                        }
                        break;
                    case "CS: OG":
                        if (csOG > remainBalance)
                        {
                            Console.WriteLine("Too Expensive");
                        }
                        else
                        {
                            remainBalance -= csOG;
                            spend += csOG;
                            Console.WriteLine($"Bought {game}");
                        }
                        break;
                    case "Zplinter Zell":
                        if (zplinterZell > remainBalance)
                        {
                            Console.WriteLine("Too Expensive");
                        }
                        else
                        {
                            remainBalance -= zplinterZell;
                            spend += zplinterZell;
                            Console.WriteLine($"Bought {game}");
                        }
                        break;
                    case "Honored 2":
                        if (honored2 > remainBalance)
                        {
                            Console.WriteLine("Too Expensive");
                        }
                        else
                        {
                            remainBalance -= honored2;
                            spend += honored2;
                            Console.WriteLine($"Bought {game}");
                        }
                        break;
                    case "RoverWatch":
                        if (roverWatch > remainBalance)
                        {
                            Console.WriteLine("Too Expensive");
                        }
                        else
                        {
                        remainBalance -= roverWatch;
                        spend += roverWatch;
                        Console.WriteLine($"Bought {game}");
                        }
                        break;
                        
                    default:
                        if (game == "Game Time")
                        {
                            break;
                        }
                        Console.WriteLine("Not Found");
                        break;
                }
                
                if (remainBalance==0)
                {
                    Console.WriteLine("Out of money!");
                    return;
                }

            }
            Console.WriteLine($"Total spent: ${spend:f2}. Remaining: ${remainBalance:f2}");
        }
    }
}
