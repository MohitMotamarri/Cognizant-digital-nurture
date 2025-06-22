package com.packagee;

public class Searches 
{
	
    public int linearSearch(Product[] products, String targetName) 
    {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(targetName))
            {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(Product[] products, String targetName)
    {
    	
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = targetName.compareToIgnoreCase(products[mid].productName);
            if (cmp == 0) return mid;
            else if (cmp > 0) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
