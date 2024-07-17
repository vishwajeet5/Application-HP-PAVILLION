public class printSubarrays {
    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };

        for (int i = 0; i < number.length; i++) {
            System.out.print("(" + number[i] + ")");
            int j = (i + 1);

            while (j < number.length) {
                System.out.print("(" + number[i] + ", " + number[j] + ")");
                j++;
            }

            System.out.println();
        }

    }
}
