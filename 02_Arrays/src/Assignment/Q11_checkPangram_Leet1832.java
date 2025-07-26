package Assignment;

public class Q11_checkPangram_Leet1832 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    private static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        boolean[] result = new boolean[26];
        int count = 0;

        for (char ch : sentence.toCharArray()) {
            int index = ch - 'a';

            if (!result[index]) {
                result[index] = true;
                count++;
            }
            if (count == 26) {
                return true;
            }
        }

        return count == 26;
    }

}
