package pl.edu.agh.java.exercises.strings;


import java.util.Calendar;

/**
 * Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. Return 0
 * if there are no digits in the string.
 * Note:
 * Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
 * Integer.parseInt(string) converts a string to an int.
 * <p>
 * Dla danego ciągu znaków zwróć sumę cyfr 0-9, które w nim wystąpią. Zwróć 0 jeśli ciąg znaków nie zawiera żadnych cyfr.
 * Warto wiedzieć:
 * Character.isDigit(char) sprawdza czy dany znak jest jednym ze znaków '0', '1', .. '9'.
 * Integer.parseInt(string) konwertuje string to liczby całkowitej.
 *
 * @seehttp://codingbat.com/prob/p197890
 */
public class StringSumDigits {
    public int sumDigits(String str) {

        int result = 0;

        for (char c : str.toCharArray()) {

            if (Character.isDigit(c)) {
                result += Integer.parseInt(String.valueOf(c));
            }
        }

        return result;
    }
}
