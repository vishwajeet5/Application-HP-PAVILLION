public class half_pyramid {
    
    public static void main(String args[]){
        int l = 10;

        for (int i = 1; i <= l; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
