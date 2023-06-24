package LearningRecursion;

class Solution2169 {
    public static void main(String[] args) {
        System.out.println(countOperations1(2,9));
    }
    public static int countOperations(int num1, int num2) {
        return helper(num1, num2, 0);
    }

    public static int helper(int num1, int num2, int ops){
        if (num1 == 0 || num2 == 0) return ops;
        if(num1 >= num2) return helper(num1-num2, num2, ops + 1);
        else return helper(num1, num2 - num1, ops + 1);
    }

    public static int countOperations1(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }

        if (num1 >= num2) {
            return (num1 / num2) + countOperations(num1 % num2, num2);
        }

        return (num2 / num1) + countOperations(num1, num2 % num1);
    }
}