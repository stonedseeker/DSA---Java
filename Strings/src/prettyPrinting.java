public class prettyPrinting {
    public static void main(String[] args) {
        float a = 134.32942f;
        System.out.printf("The  formatted number is %.2f\n", a);

        System.out.printf("PI: %.3f",Math.PI);
    }

    //operator overloading is not supported in Java
    // by operator overloading u can modify an operator to do more tasks than it is made for
    //but this results in poor code quality
    //languages like c++ and python support operator overloading
}
