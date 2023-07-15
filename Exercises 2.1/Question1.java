// 1. Calculate the product of the odd integers From 1 to 15;

public class Question1 {
    public static void main(String[] args) {
        int product = 1; // Initialize product to 1

        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 1)
                product *= i; // Multiply the product by the odd integer
        }

        System.out.println("Product of the odd integers from 1 to 15: " + product);
    }
}
