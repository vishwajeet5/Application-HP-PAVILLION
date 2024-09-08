import java.util.*;
class Result {
    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int date, int year) {
        // my code
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH, date);
        cal.set(Calendar.YEAR, year);
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
    }
}
public class JavaDateAndTime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in the format of dd mm yyyy");
        int date = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        findDay(month, date, year);
        sc.close();
    }

    private static char[] findDay(int month, int date, int year) {
        
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH, date);
        cal.set(Calendar.YEAR, year);
        cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        throw new UnsupportedOperationException("Unimplemented method 'findDay'");
        
    } 
    
}