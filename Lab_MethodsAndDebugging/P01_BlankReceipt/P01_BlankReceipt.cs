using System;


namespace P01_BlankReceipt
{
    class P01_BlankReceipt
    {

        static void Main(string[] args)
        {
            PrintReciept();
        }

        static void PrintReciept()
        {
            PrintRecieptHeader();
            PrintRecieptBody();
            PrintRecieptFooter();
        }

        static void PrintRecieptHeader()
        {
            Console.WriteLine("CASH RECEIPT");
            Console.WriteLine("------------------------------");
        }

        static void PrintRecieptBody()
        {
            Console.WriteLine("Charged to____________________");
            Console.WriteLine("Received by___________________");
        }

        static void PrintRecieptFooter()
        {
            Console.WriteLine("------------------------------");
            Console.WriteLine("\u00A9 SoftUni");
        }


    }
}
