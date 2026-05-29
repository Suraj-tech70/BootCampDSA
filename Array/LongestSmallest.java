// find the Longest and smallest element in an Array
public class LongestSmallest {
    public static void main(String[] args) {
        String[] arr = {"Java", "C", "Programming", "Python", "AI"};

        String longest = arr[0];
        String smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > longest.length()) {
                longest = arr[i];
            }

            if (arr[i].length() < smallest.length()) {
                smallest = arr[i];
            }
        }

        System.out.println("Longest Element: " + longest);
        System.out.println("Smallest Element: " + smallest);
    }
}