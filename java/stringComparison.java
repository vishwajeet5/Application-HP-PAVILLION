public class stringComparison {
    public static void main(String args[]){
        String s1 = "kumar";
        String s2 = "kumar";
        String s3 = new String("kumar");
        
        if (s1.equals(s2)){
            System.out.println("Both are equal");
        }else{
            System.out.println("not equal");
        }

        if (s1.equals(s3)){
            System.out.println("Both are equal");
        }else{
            System.out.println("not equal");
        }
    }
}
