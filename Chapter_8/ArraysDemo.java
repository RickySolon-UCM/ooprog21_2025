public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];

        display("Original array:", arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 8;
        }
        display("After filling with 8s:", arr);

        arr[2] = 6;
        arr[4] = 3;
        display("After changing two values:", arr);

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        display("After sorting:", arr);
    }

    public static void display(String msg, int[] array) {
        System.out.print(msg + "   ");
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

