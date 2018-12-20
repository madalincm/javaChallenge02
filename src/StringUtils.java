import java.util.ArrayList;
import java.util.HashMap;

public final class StringUtils {

    public static String parseText(String text) {
        return text.toLowerCase();
    }

    public static ArrayList<Integer> findAllOccurences(String text, char currentElement){
        int index = text.indexOf(currentElement);
        ArrayList<Integer> positions = new ArrayList<>();
        while (index >= 0) {
            positions.add(index + 1);
            index = text.indexOf(currentElement, index + 1);
        }
        return positions;
    }

    public static HashMap<Character, ArrayList<Integer>> createMap(String text) {

        ArrayList<Integer> positions = new ArrayList<>();
        HashMap<Character, ArrayList<Integer>> hashMap = new HashMap<>();
        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            positions = findAllOccurences(text, c);
            hashMap.put(c, positions);
        }
        return hashMap;
    }
}
