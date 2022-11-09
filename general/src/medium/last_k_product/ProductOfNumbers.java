package medium.last_k_product;

import java.util.ArrayList;
import java.util.List;

public class ProductOfNumbers {
    List<Integer> productList;
    int productOfElements;
    public ProductOfNumbers() {
        productList = new ArrayList<>();
        productOfElements = 1;
    }

    public void add(int num) {
        if (num == 0) {
            productList = new ArrayList<>();
            productOfElements = 1;
        } else {
            productOfElements *= num;
            productList.add(productOfElements);
        }
    }

    public int getProduct(int k) {
        // If the elements in the list has zero, then the list size is less than the elements
        if(productList.size() < k) return 0;
        int ans = productList.get(productList.size() - 1);
        if(productList.size() == k) return ans;
        return (ans / productList.get(productList.size() - 1 - k));
    }
}
