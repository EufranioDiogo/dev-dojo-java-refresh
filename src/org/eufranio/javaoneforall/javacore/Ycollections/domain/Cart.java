package org.eufranio.javaoneforall.javacore.Ycollections.domain;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Cart {
    private final long id;
    private final List<CartProduct> productList;

    public Cart() {
        this.id = ThreadLocalRandom.current().nextLong();
        this.productList = new ArrayList<>();
    }

    public void addProductList(Product product, int quantityOfTheProduct) {
        CartProduct cartProduct = new CartProduct(product, quantityOfTheProduct);
        int index = productList.indexOf(cartProduct);

        if (index > -1) {
            productList.get(index).updateQuantity(quantityOfTheProduct);
        } else {
            productList.add(cartProduct);
        }
    }

    public double getTotalOfCart() {
        double total = 0;

        for (CartProduct cartProduct : this.productList) {
            total += cartProduct.getTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Cart{\n" +
                "id=" + id +
                "\n, total=" + this.getTotalOfCart() +
                "\n, productList=" + productList +
                '}';
    }

    static class CartProduct {
        private final Product product;
        private int quantProducts;
        private double total;

        public CartProduct(Product product, int quantProducts) {
            this.product = product;
            this.quantProducts = quantProducts;
            this.updateTotal();
        }

        public double getTotal() {
            return this.total;
        }

        public void updateQuantity(int quantity) {
            if (this.quantProducts - quantity < 0) {
                System.out.println("Can't decrease " + quantity + " of " + this.product.getName());
                return;
            }
            this.quantProducts += quantity;
            updateTotal();
        }

        private void updateTotal() {
            this.total = this.product.getPrice() + this.quantProducts;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CartProduct that = (CartProduct) o;
            return Objects.equals(product, that.product);
        }

        @Override
        public int hashCode() {
            return Objects.hash(product);
        }

        @Override
        public String toString() {
            return "CartProduct{" +
                    "product=" + product +
                    ", quantProducts=" + quantProducts +
                    ", total=" + total +
                    '}';
        }
    }


}
