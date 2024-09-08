public class stringUppercase{
    public static String toUppercase(String str){
        StringBuilder sd = new StringBuilder("");
        sd.append(Character.toUpperCase(str.charAt(0)));
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                sd.append(str.charAt(i));
                i++;
                sd.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sd.append(str.charAt(i));
            }
        }
        return sd.toString();
    }
    public static void main(String args[]){
        String str = "my name is vishwajeet.";
        System.out.println(toUppercase(str));
    }
}