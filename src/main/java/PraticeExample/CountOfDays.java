package PraticeExample;

public class CountOfDays {
    public static void main(String args[]){
        int year, week, day;
       int days=1329;
         year=days / 365;
         week=(days % 365)/ 7;
         day= days-((year*365) + (week*7));


        System.out.println( "years:" + year);
        System.out.println( "week:" +week);
        System.out.println( "day :" + day);








    }
}
