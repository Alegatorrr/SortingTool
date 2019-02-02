
public class SortingTool {

    public static void main(String[] args) {

        SortingToolLong sortlong = new SortingToolLong();
        SortingToolWord sortword = new SortingToolWord();
        SortingToolLine sortline = new SortingToolLine();


        if (args.length>0){

        if ("long".equals(args[0])) {
            sortlong.sortingToolLong();

        } else if ("line".equals(args[0])) {
            sortline.sortingToolLine();

        } else if ("word".equals(args[0])) {
            sortword.sortingToolWord();}

        } else {
            sortword.sortingToolWord();

        }

    }
}
