package com.example.boyanyosifov.myapplication.com.online.shop.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.boyanyosifov.myapplication.R;
import com.example.boyanyosifov.myapplication.com.online.shop.repository.Product;
import com.example.boyanyosifov.myapplication.com.online.shop.utils.SharedProductRefs;

import java.util.List;

public class CheckRecyclerViewAdapter extends RecyclerView.Adapter<CheckRecyclerViewHolder>{
    private Context context;

    private List<Product> mProductObject;


    public CheckRecyclerViewAdapter(Context context, List<Product> mProductObject) {
        this.context = context;
        this.mProductObject = mProductObject;
    }

    @Override
    public CheckRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        try{
            View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_layout, parent, false);
            CheckRecyclerViewHolder productHolder = new CheckRecyclerViewHolder(layoutView);
            return productHolder;
        }
        catch (InflateException ex){
            System.out.println(ex.getStackTrace());
            return null;
        }

    }

    @Override
    public void onBindViewHolder(CheckRecyclerViewHolder holder, int position) {
        //get product quantity
        holder.quantity.setText("1");
        holder.productName.setText(mProductObject.get(position).getModel());
        holder.productPrice.setText(String.valueOf(mProductObject.get(position).getPrice()) + " $");

        holder.removeProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Do you want to remove product from cart", Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mProductObject.size();
    }
}
