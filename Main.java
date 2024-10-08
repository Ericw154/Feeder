public class Main
{
    public static void main(String[] args)
    {
        Feeder g = new Feeder(500);
        g.simulateOneDay(12);
        System.out.println(g);

        Feeder h = new Feeder(1000);
        h.simulateOneDay(22);
        System.out.println(h);

        Feeder i = new Feeder(100);
        i.simulateOneDay(5);
        System.out.println(i);

        Feeder j = new Feeder(2400);
        System.out.println(j.simulateManyDays(10, 4));

        Feeder k = new Feeder(250);
        System.out.println(k.simulateManyDays(10, 5));

        Feeder l = new Feeder(0);
        System.out.println(l.simulateManyDays(5, 10));



    }

    
}
