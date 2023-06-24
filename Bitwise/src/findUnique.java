public class findUnique {
    public static void main(String[] args) {
        int[] arr = {};//1,1,2,2,3,3,4,4,5,5,6,7,7
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;

        for(int n : arr) {
//           / System.out.println(unique);
            unique ^= n;
            System.out.print(" " + unique);
        }
        return unique;
    }
}
