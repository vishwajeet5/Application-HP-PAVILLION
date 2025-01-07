public class findParmutations {
    public static void findParmutation(String str, String ans){
        // base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        // recursion work
        for(int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
            String s = str.substring(0, i) + str.substring(i+1);
            findParmutation(s, ans+curr);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        findParmutation(str,"");
    }
}
