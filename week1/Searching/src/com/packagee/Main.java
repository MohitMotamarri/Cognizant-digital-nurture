package com.packagee;

public class Main {
    public static void main(String[] args) 
    {
    	
        Product[] unsortedProducts = 
        {
            new Product(101, "laptop", "electronics"),
            new Product(102, "shoes", "footwear"),
            new Product(103, "watch", "accessories"),
            new Product(104, "camera", "electronics"),
            new Product(105, "phone", "electronics")
        };
        
        //in sorted array the products are sorted in alphabetical order of product name
        Product[] sortedProducts = 
        {
            new Product(104, "camera", "electronics"),
            new Product(101, "laptop", "electronics"),
            new Product(105, "phone", "electronics"),
            new Product(102, "shoes", "footwear"),
            new Product(103, "watch", "accessories")
        };

        Searches searchEngine = new Searches();

        int indexLinear = searchEngine.linearSearch(unsortedProducts, "laptoP");
        System.out.println("Linear Search Index: " + indexLinear);

        int indexBinary = searchEngine.binarySearch(sortedProducts, "caMera");
        System.out.println("Binary Search Index: " + indexBinary);
    }
}

