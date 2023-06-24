package PatternsBubbleSortSelectionSort;

public class Triangle {
    public static void main(String[] args) {
//        patter1(4,0 );
        patter2(4, 0);
    }

    public static void patter2(int r, int c) {
        if (r == 0) return;

        if (c < r){
            patter2(r,c+1);
            System.out.print("*");
        } else {
            patter2(r-1,0);
            System.out.println();
        }
    }






    private static void patter1(int r, int c) {
        if (r == 0) return;
        if (c < r) {
            System.out.print("*");
            patter1(r,c+1);
        }
    }
}
