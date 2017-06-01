using System;

namespace Problem5_ForeignLanguages
{
    class Problem5_ForeignLanguages
    {
        static void Main(string[] args)
        {
            var country = Console.ReadLine();

            switch (country)
            {
                case "USA":
                case "England":
                    Console.WriteLine("English");
                    break;
                case "Spain":
                case "Argentina":
                case "Mexico":
                    Console.WriteLine("Spanish");
                    break;

                default:
                    Console.WriteLine("unknown");
                    break;
            }

            //if (country.Equals("USA") || country.Equals("England"))
            //{
            //    Console.WriteLine("English");
            //}
            //else if (country.Equals("Spain") || country.Equals("Argentina") || country.Equals("Mexico"))
            //{
            //    Console.WriteLine("Spanish");
            //}
            //else
            //{
            //    Console.WriteLine("unknown");
            //}
        }
    }
}
