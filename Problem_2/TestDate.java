public class TestDate {
    public static void main(String[] args) {
        Date date1 = new Date(19, 1, 2017);
        System.out.println("Initial Date:  " + date1.toString());
        
        // Use the setters to change the date
        date1.setDate(9, 12, 2024);
        
        // Display the updated date
        System.out.println("Updated Date:  " + date1.toString());
        
        // Create another Date object and test individual setters
        Date date2 = new Date(1, 1, 2022);
        date2.setDay(31);
        date2.setMonth(12);
        date2.setYear(2023);
        
        // Display the date after individual setters
        System.out.println("Modified Date: " + date2.toString());
    }
}
