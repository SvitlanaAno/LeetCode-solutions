/*
Julius Caesar protected his confidential information by encrypting it using a cipher.
Caesar's cipher shifts each letter by a number of letters.
If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet.
In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.

Original alphabet:      abcdefghijklmnopqrstuvwxyz
Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc

Example
The alphabet is rotated by , matching the mapping above. The encrypted string is .

Note: The cipher only encrypts letters; symbols, such as -, remain unencrypted.

Function Description

Complete the caesarCipher function in the editor below.

caesarCipher has the following parameter(s):

string s: cleartext
int k: the alphabet rotation factor
Returns

string: the encrypted string
 */

public class CaesarCipherFunction {
    // O(n) time \ O(n) space
    static public String caesarCipher1(String s, int k) {
        char[] text = new char[s.length()];
        k = k%26;


        for(int i = 0; i< s.length(); i++){
            text[i] = getNewLetter(s.charAt(i), k);
        }
        return String.valueOf(text);
    }

    private static char getNewLetter(char letter, int k) {
        int  newLetter = (char)(letter + k);
        return newLetter <= 'z'? (char)newLetter : (char)(('a'-1)  + newLetter%'z');
    }
}
