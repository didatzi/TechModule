using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P16_DebuggingInstructionSet
{
    class P16_DebuggingInstructionSet
    {
        static void Main(string[] args)
        {

            while (true)
            {
                string opCode = Console.ReadLine().ToUpper();
                if (opCode != "END")
                {
                    string[] codeArgs = opCode.Split(' ');

                    long result = 0;
                    switch (codeArgs[0])
                    {
                        case "INC":
                            {
                                long operandOne = long.Parse(codeArgs[1]);
                                result = ++operandOne;
                                break;
                            }
                        case "DEC":
                            {
                                long operandOne = long.Parse(codeArgs[1]);
                                result = --operandOne;
                                break;
                            }
                        case "ADD":
                            {
                                long operandOne = long.Parse(codeArgs[1]);
                                long operandTwo = long.Parse(codeArgs[2]);
                                result = operandOne + operandTwo;
                                break;
                            }
                        case "MLA":
                            {
                                long operandOne = long.Parse(codeArgs[1]);
                                long operandTwo = long.Parse(codeArgs[2]);
                                result = operandOne * operandTwo;
                                break;
                            }
                        default:
                            return;
                    }
                    Console.WriteLine(result);
                }
                else
                {
                    break;
                }
            }
        }
    }
}
