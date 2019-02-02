import java.util.*;

public class SortingToolLong {

     public void sortingToolLong() {

         ArrayList<Long> longList = new ArrayList<>();
         Scanner scanner = new Scanner(System.in);

         while (scanner.hasNextLong()) {
             final long number = scanner.nextLong();
             longList.add(number);
         }


         System.out.println("Total numbers: " + longList.size() + ".");

         System.out.println("The greatest number: " + Collections.max(longList) + " (1 time(s)" + "," + " " + 100 / longList.size() + "%" + ")" + ".");

     }

}
