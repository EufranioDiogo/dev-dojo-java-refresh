package org.eufranio.javaoneforall.javacore.Ycollections.test;

import org.eufranio.javaoneforall.javacore.Ycollections.domain.Cart;
import org.eufranio.javaoneforall.javacore.Ycollections.domain.Product;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class CartComparatorByTotalOfCart implements Comparator<Cart> {

    @Override
    public int compare(Cart o1, Cart o2) {
        return Double.compare(o1.getTotalOfCart(), o2.getTotalOfCart());
    }
}

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Cart> queue = new PriorityQueue<>(new CartComparatorByTotalOfCart().reversed());

        Product banana1 = new Product(1, "Banana", 200);

        Product maca = new Product(2, "Maçã", 150);

        Cart cart1 = new Cart();
        Cart cart2 = new Cart();
        Cart cart3 = new Cart();

        cart1.addProductList(banana1, 10);
        cart2.addProductList(banana1, 20);
        cart3.addProductList(banana1, 15);
        cart2.addProductList(banana1, 20);
        cart2.addProductList(maca, 10);
        cart1.addProductList(banana1, 6);

        queue.add(cart3);
        queue.add(cart1);
        queue.add(cart2);


        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
