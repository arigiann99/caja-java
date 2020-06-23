/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GIANELLI
 */
public class Storage {
  private Product[] products;

    public Storage() {
        this.products = new Product[4];
        products[0] = new Product("PAPA", 0, 0);
        products[1] = new Product("ARROZ", 0, 0);
        products[2] = new Product("CARNE", 0, 0);
        products[3] = new Product("Cebolla", 0, 0);
    }

    public void buyProduct(int i, int q, float p) {
        products[i].addQuantity(q);
        products[i].setPrice(p);
    }

    public void saleProduct(int i, int q) {
        products[i].delQuantity(q);
        System.out.println("El valor a recaudar es: " + products[i].getPrice() * products[i].getQuantity() * 1.2);
    }

    public Product[] getProducts() {
        return this.products;
    }  
}
