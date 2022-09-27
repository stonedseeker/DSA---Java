import java.util.Arrays;

public class flipinmatrix {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {1,1,1}
        };
        int[][] arr = flipAndInvertImage(image);
        System.out.println(Arrays.toString(flipped(arr)));
    }
    public static int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++){
            for (int j = 0; j < image[i].length; j++){
                image[i][j] = swap(image[i][j], image[i][image[i].length - 1 - j]);
            }
        }
        return image;
    }

    public static int[][] flipped(int[][] image) {
        for (int i = 0; i < image.length; i++){
            for (int j = 0; j < image.length; j++) {
                if (image[i][j] == 0){
                    image[i][j] = 1;
                }else{
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }

    public static int swap(int i, int j){
        int temp;
        temp = i;
        i = j;
        j = temp;
        return i;
    }
}

