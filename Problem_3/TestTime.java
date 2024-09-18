public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(12, 36, 40);
        Time t2 = new Time(00, 00, 00);

        // Display initial times
        System.out.println("\nInitial Time: " + t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond());
        System.out.println("Initial Time: " + t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSecond());

        // Display initial times using toString()
        System.out.println("\nInitial time t1 using toString(): " + t1.toString());
        System.out.println("Initial time t2 using toString(): " + t2.toString());

        // Display time t1 using setTime
        t1.setTime(21, 10, 15);
        System.out.println("\nTime t1 is set to: " + t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond());

        // Display time t2 using setTime
        t2.setTime(10, 20, 25);
        System.out.println("Time t2 is set to: " + t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSecond());

        // Display time t1 and t2 using setters and toString
        t1.setHour(21);
        t1.setMinute(10);
        t1.setSecond(15);
        System.out.println("\nSet time t1 using toString(): " + t1.toString());

        
        t2.setHour(10);
        t2.setMinute(20);
        t2.setSecond(25);
        System.out.println("Set time t2 using toString(): " + t2.toString());

        //  Calling nextSecond() for t1
        t1.nextSecond();
        System.out.println("\nThe time t1 after incrementing a second: " + t1.toString());

        //  Calling previousSecond() for t2
        t2.previousSecond();
        System.out.println("The time t2 after subtracting a second: " + t2.toString());
    }
}
