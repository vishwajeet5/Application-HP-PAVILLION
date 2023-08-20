import java.util.ArrayList;

public class findAllIndices {
    static ArrayList<Integer> allIndices(int[] arr, int target, int idx) {
        // base case
        if (idx >= arr.length) return new ArrayList<Integer>();
        // self work
        ArrayList<Integer> ans = new ArrayList<>();
        if (arr[idx] == target) ans.add(idx);
        // recursion work
        ArrayList<Integer> smallAns = allIndices(arr, target, idx + 1);
        ans.addAll(smallAns);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 8, 6, 9, 8, 7, 8 };
        int target = 8;
        ArrayList<Integer> ans = allIndices(arr, target, 0);
        for (Integer i : ans)
            System.out.println(i);
    }
}
