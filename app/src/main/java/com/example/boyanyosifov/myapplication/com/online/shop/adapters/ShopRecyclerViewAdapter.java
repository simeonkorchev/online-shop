package com.example.boyanyosifov.myapplication.com.online.shop.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.boyanyosifov.myapplication.ProductActivity;
import com.example.boyanyosifov.myapplication.R;
import com.example.boyanyosifov.myapplication.StoreActivity;
import com.example.boyanyosifov.myapplication.com.online.shop.repository.Product;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class ShopRecyclerViewAdapter extends RecyclerView.Adapter<ShopRecyclerViewHolder>{

    private Context context;

    private List<Product> allProducts;

    public ShopRecyclerViewAdapter(Context context, List<Product> allProducts) {
        this.context = context;
        this.allProducts = allProducts;
    }

    @NonNull
    @Override
    public ShopRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_listing, parent, false);
        ShopRecyclerViewHolder productHolder = new ShopRecyclerViewHolder(layoutView);
        return productHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ShopRecyclerViewHolder holder, int position) {
        final Product singleProduct = allProducts.get(position);

        holder.productName.setText(singleProduct.getModel());
        if(singleProduct.getModel().contains("Samsung"))
            holder.produceImage.setImageResource(R.drawable.samsung_galaxy_s6);
        if(singleProduct.getModel().contains("Iphone"))
            holder.produceImage.setImageResource(R.drawable.apple_iphone_6s1);
        if(singleProduct.getModel().contains("Lenovo"))
            holder.produceImage.setImageResource(R.drawable.lenovot540p);
        if(singleProduct.getModel().contains("Acer"))
            holder.produceImage.setImageResource(R.drawable.aceraspiree5);


        holder.produceImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent productIntent = new Intent(context, ProductActivity.class);

                GsonBuilder builder = new GsonBuilder();
                Gson gson = builder.create();

                String productJson = gson.toJson(singleProduct);


                productIntent.putExtra("PRODUCT", productJson);
                context.startActivity(productIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return allProducts.size();
    }
}
