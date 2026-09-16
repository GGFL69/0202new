import java.util.ArrayList;
import java.util.HashMap;
public class Task2 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> stateHolidays = new HashMap<>();
        ArrayList<Integer> Jan = new ArrayList<>();
        Jan.add(1);
        Jan.add(7);
        ArrayList<Integer> Feb = new ArrayList<>();
        Feb.add(23);
        ArrayList<Integer> Mar = new ArrayList<>();
        Mar.add(8);
        ArrayList<Integer> May = new ArrayList<>();
        May.add(1);
        May.add(9);
        ArrayList<Integer> Jun = new ArrayList<>();
        Jun.add(12);
        ArrayList<Integer> Nov = new ArrayList<>();
        Nov.add(4);
        stateHolidays.put("Январь", Jan);
        stateHolidays.put("Февраль", Feb);
        stateHolidays.put("Март", Mar);
        stateHolidays.put("Май", May);
        stateHolidays.put("Июнь", Jun);
        stateHolidays.put("Ноябрь", Nov);
    }
}
