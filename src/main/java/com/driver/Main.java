package com.driver;

class Main {

    // Task 1: Create a class Product inside Main class
    static class Product {

        // Task 3: Method with two integer parameters
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Overloaded method with three integer parameters
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Overloaded method with two double parameters
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2: Create object of Product in Main function
        Product p = new Product();

        // Task 3: Call the first method
        System.out.println("Product of 2 and 3: " + p.product(2, 3));

        // Task 4: Call the overloaded method with three parameters
        System.out.println("Product of 2, 3 and 4: " + p.product(2, 3, 4));

        // Task 5: Call the overloaded method with double parameters
        System.out.println("Product of 2.5 and 3.5: " + p.product(2.5, 3.5));
    }
}
