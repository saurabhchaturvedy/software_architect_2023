package Brainstormed_Questions_Garage;

public class ProductExceptSelf {


    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        // Calculate the left products
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            output[i] = leftProduct;
            leftProduct *= nums[i];
        }

        // Calculate the right products and combine with left products
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return output;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        int[] result = productExceptSelf.productExceptSelf(arr);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
