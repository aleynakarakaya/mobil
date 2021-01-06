package com.example.onlineproductsapp.model;

public class ProductCategory {

    Integer productId;
    String ProductName;

    public ProductCategory(Integer productId, String productName) {
        this.productId = productId;
        this.ProductName = productName;

    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }
}






}
