import java.util.ArrayList;
import java.util.HashMap;

public class TestString {

    private String text;
    private HashMap<Character, ArrayList<Integer>> positions;

    public TestString(String text) {
        this.text = text;
        this.positions = StringUtils.createMap(text);
    }

    public void printString(){
        System.out.println(this.text);
    }

    public void printPositions(){
        this.positions.forEach((key, value) ->
                System.out.println(key + " apare de  " + value.size() + " ori" + " pe pozitiile " + value ));
    }
}
