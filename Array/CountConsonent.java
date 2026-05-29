//Count consonent in an Array
public class CountConsonent {
    public static void main(String[] args) {
        String[] arr = {"Programming","Hello word"};

        for (String str : arr) {
            int count = 0;

            str = str.toLowerCase();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if ((ch >= 'a' && ch <= 'z') &&
                    ch != 'a' && ch != 'e' &&
                    ch != 'i' && ch != 'o' &&
                    ch != 'u') {
                    count++;
                }
            }

            System.out.println("Consonants in \"" + str + "\" = " + count);

        }
    }
}