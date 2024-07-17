public class reverseInArray {
    

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        int i = 0, j = number.length - 1 , temp;
        while (i < j) {
            temp = number[i];
            number[i] = number[j];
            number[j] = temp;
            i++;
            j--;
        }

        for (int n = 0; n < number.length; n++) {
            System.out.print(number[n] + " ");
        }
    }
}