public class stringBuilder {
    public static void main(String args[]){
        StringBuilder sd = new StringBuilder("");
        for(char i = 'a'; i <= 'z'; i++){ //O(26)
            sd.append(i);
        }
        System.out.println(sd);
        System.out.println(sd.length());
    }
}
