package LearningRecursion;

class Solution1342 {
    static int c = 0;
    public static int numberOfSteps(int n, int c) {
        
        while(n > 0){
            System.out.println(n  +" "+ c);
            if (n % 2 == 0) return numberOfSteps(n/2,c+1);
            
            else return (numberOfSteps(n-1, c+1));
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(8,0));
    }
}