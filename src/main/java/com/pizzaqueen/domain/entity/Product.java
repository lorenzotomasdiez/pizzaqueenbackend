package com.pizzaqueen.domain.entity;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idproduct")
    private Integer idProduct;

    @Column(name="product_name")
    private String productName;

    @Column(name="product_category")
    private String productCategory;

    @Column(name="product_price")
    private double productPrice;

    @Column(name="product_stock")
    private Integer productStock;

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
