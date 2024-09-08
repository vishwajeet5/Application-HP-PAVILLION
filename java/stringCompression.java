public class stringCompression{
    public static String compression(String str){
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
        Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count != 1){
                // newStr += count;
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static String bCompression(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < str.length(); i++){
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
    
    public static void main(String args[]){
        String str = "aaaabbbbccddefffgg";
        System.out.println(compression(str)); // by String
        System.out.println(bCompression(str)); // by StringBuilder
    }
}