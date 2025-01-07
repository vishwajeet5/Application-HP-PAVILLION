public class findSubsets {
    public static void findSubset(String str, String ans, int i){
        // base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.print("null");
            }else{
                System.out.print(ans + " ");
            }
            // System.out.println(ans);
            return;
        }
        // recursion work
        // Yes choice
        findSubset(str, ans + str.charAt(i), i+1);
        // No choice
        findSubset(str, ans, i+1);
    }
    public static void main(String args[]){
        String str = "abc";
        findSubset(str, "", 0);
    }
}
