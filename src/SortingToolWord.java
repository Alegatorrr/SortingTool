import java.util.*;

public class SortingToolWord {

       public void sortingToolWord() {

        ArrayList<String> wordList = new ArrayList<>();
        ArrayList<Integer> lengthList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            final String word = scanner.next();
            wordList.add(word);
            lengthList.add(word.length());
    }

        int y = Collections.max(lengthList);

        System.out.println("Total words: " + wordList.size() + ".");
        System.out.println("The longest word: " + wordList.get(lengthList.indexOf(y)) + " (1 time(s)" + "," + " " + 100 / wordList.size() + "%" + ")" + ".");

    }

}
