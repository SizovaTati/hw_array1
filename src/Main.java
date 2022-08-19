public class Main {
    public static void main(String[] args) {
        //Task 1

        int[] numbers = new int[3];
        numbers[0] = -1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);


        float[] array = {-1.57f, 7.654f, 9.986f};
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else System.out.print(array[i] + "\n");
        }


        int[] arr = new int[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 15;
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        //Task 3
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(numbers[i] + ", ");
            } else System.out.print(numbers[i]);
        }
        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(array[i] + ", ");
            } else System.out.print(array[i]);
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr[i] + ", ");
            } else System.out.print(arr[i]);
        }

        System.out.println("\n");

        //Task 4
        for (int t = 0; t < numbers.length; t++) {
            if (numbers[t] % 2 != 0) {
                numbers[t]++;
                System.out.print(numbers[t] + " ");
            } else System.out.print(numbers[t] + " ");
        }
   }
}