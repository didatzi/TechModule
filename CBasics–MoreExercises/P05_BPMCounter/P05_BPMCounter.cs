using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P05_BPMCounter
{
    class P05_BPMCounter
    {
        static void Main(string[] args)
        {
            var bpm = int.Parse(Console.ReadLine());
            var beats = int.Parse(Console.ReadLine());

            double bars = Math.Round(beats / 4.0, 1);
            double secondsPerBeat = 60.0 / bpm;
            double totalSeconds = secondsPerBeat * beats;
            int minutes = (int)totalSeconds / 60;
            int seconds = (int)totalSeconds % 60;

            Console.WriteLine($"{bars} bars - {minutes}m {seconds}s");
        }
    }
}
