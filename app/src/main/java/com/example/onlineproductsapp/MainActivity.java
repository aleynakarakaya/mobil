package com.example.onlineproductsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.onlineproductsapp.adapter.ProductAdapter;

public class MainActivity extends AppCompatActivity {

    ProductAdapter productAdapter;
    RecyclerView productCatRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ProductCategory> productCategoryList = new ArrayList<>();
        productCategoryList.add(new ProductCategory(productId: 1, productName: "Most Popular"));
        productCategoryList.add(new ProductCategory(productId: 2, productName: "All Body Products"));
        productCategoryList.add(new ProductCategory(productId: 3, productName: "Skin Care"));
        productCategoryList.add(new ProductCategory(productId: 4, productName: "Hair"));

        setProductRecycler(productCategoryList);
    }

    private void setProductRecycler(List<ProductCategory> productCategoryList){

        productCatRecycler = findViewById(R.id.cat_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context: this, RecyclerView.HORIZONTAL, reverseLayout: false);
        productCatRecycler.setLayoutManager(layoutManager);
        productAdapter = new ProductAdapter(context: this, productCategoryList);
        productCatRecycler.setAdapter(productAdapter);
    }

}