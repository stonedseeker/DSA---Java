public class findNthBit {
    public static void main(String[] args) {
        int num = 10010001;
        System.out.println(Bit(num, 4));
    }

    private static int Bit(int num, int n) {
        int index = 1 << n;
        return num & index;
    }
}
