package Recursion.practise;

public class reverse_string {
    public static void main(String[] args) {
        String name = "Raheel";
        String s = reverse(name, 0, name.length() - 1);
        System.out.println(s);
    }

    public static String reverse(String s, int i, int j) {
        if (i >= j) {
            return s;
        }

        // Convert the string to a character array
        char[] charArray = s.toCharArray();

        // Swap the characters at positions i and j
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;

        // Convert the character array back to a string
        s = new String(charArray);

        // Recursively call the reverse method
        return reverse(s, i + 1, j - 1);
    }
}
