package BinarySearchQuestions.src;

    public class findTargetfloor {
        public static void main(String[] args) {
            int[] arr = {2, 3, 5, 9, 14, 16, 18};
            System.out.println(biSearch(arr, 15));
        }

        public static int biSearch(int[] arr, int target) {
            int start = 0;
            int end = arr.length;

            while (start <= end) {

                int mid = start + (end - start) / 2;

                if (arr[mid] >= target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return end;
        }
    }

