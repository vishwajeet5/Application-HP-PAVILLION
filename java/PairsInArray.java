public class PairsInArray {
    public static void main(String[] args){
        int number[] = {2, 4, 6, 8, 10};
        for(int i = 0; i < number.length; i++){
            for(int j = i + 1; j < number.length; j++){
                System.out.print("(" + number[i]+ ", " + number[j] + ")");
            }
            System.out.println();
        }
    }
}
