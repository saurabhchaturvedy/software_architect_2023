package Last_Minute_Brush_Up_Problems;

public class ProductExceptSelf {


    public int[] productExceptSelf(int[] array) {

        int[] left = new int[array.length];

        int[] right = new int[array.length];

        left[0] = 1;

        for (int i = 1; i < left.length; i++) {
            left[i] = left[i - 1] * array[i - 1];
        }

        right[array.length - 1] = 1;
        for (int i = array.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * array[i + 1];
        }

        int[] result = new int[array.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }


    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};

        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        int[] ints = productExceptSelf.productExceptSelf(array);

        for (int x : ints) {
            System.out.print(x + " ");
        }
    }
}
