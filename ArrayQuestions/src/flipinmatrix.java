import java.util.Arrays;
import java.util.Collections;

public class flipinmatrix {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {1,1,1}
        };
        System.out.println(flipAndInvertImage(image));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length / 2; j++) {
                int temp;
                temp = image[i][j];
                image[i][j] = image[i][image[i].length - 1 - j];
                image[i][image[i].length - 1 - j] = temp;
            }
        }

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }
        for ( int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(image[i]));
        }
        return image;
    }
}

