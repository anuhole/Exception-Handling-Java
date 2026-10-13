public class TestDate {
    public static void main(String[] args) {
        try {
            Date D1= new Date();
            D1.setDate(35);
            D1.setMonth(12);
            D1.setYear(2026);
        }catch (DayOutOfRangeException | MonthOuthOfRangeException e){
            System.out.println(e.getMessage());
        }


      //  System.out.println(D1);


    }
}

