public class DeleteSmallest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 3, 15};

        // Find smallest element and its index
        int min = arr[0];
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }

        // Print array after deleting smallest element
        System.out.println("Array after deleting smallest element:");

        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}