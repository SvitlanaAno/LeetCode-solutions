import java.util.HashMap;

/*
  https://www.algoexpert.io/questions/Generate%20Document
  You're given a string of available characters and a string representing a document that you need to generate.
  Write a function that determines if you can generate the document using the available characters. If you can generate
  the document, your function should return true; otherwise, it should return false.
  You're only able to generate the document if the frequency of unique characters in the characters string is greater than
  or equal to the frequency of unique characters in the document string. For example, if you're given
  characters = "abcabc" and document = "aabbccc" you cannot generate the document because you're missing one
  The document that you need to create may contain any characters, including special characters, capital letters, numbers, and spaces.
  Note: you can always generate the empty string ("").
 */
public class GenerateDocument {

    // O(n + m) time | O(k) space - where n is the number of characters, m is
    // the number of characters of the document, and k is the number of unique characters in the
    // characters string
    public boolean generateDocument(String characters, String document) {
        if (document.length() > characters.length()) return false;
        else if (document.isEmpty()) return true;

        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : characters.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Character cDoc : document.toCharArray()) {
            if (map.containsKey(cDoc) && map.get(cDoc) > 0) {
                map.put(cDoc, map.get(cDoc) - 1);
            } else {
                return false;
            }
        }
        return true;
    }

}
