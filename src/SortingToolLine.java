import java.util.*;

public class SortingToolLine {

    public void sortingToolLine() {

        ArrayList<String> lineList = new ArrayList<>();
        ArrayList<Integer> lengthList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            final String line = scanner.nextLine();
            lineList.add(line);
            lengthList.add(line.length());

        }

        int x = Collections.max(lengthList);
        int y = lengthList.indexOf(x);


        System.out.println("Total lines: " + lengthList.size() + ".");
        System.out.println("The longest line:");
        System.out.println(lineList.get(y));
        System.out.println("(1 time(s)" + "," + " " + 100 / lengthList.size() + "%" + ")" + ".");

    }


}