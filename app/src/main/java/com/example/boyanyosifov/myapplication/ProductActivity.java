package com.example.boyanyosifov.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.boyanyosifov.myapplication.com.online.shop.repository.Phone;
import com.example.boyanyosifov.myapplication.com.online.shop.repository.Product;
import com.example.boyanyosifov.myapplication.com.online.shop.utils.Constants;
import com.example.boyanyosifov.myapplication.com.online.shop.utils.SharedProductRefs;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductActivity extends AppCompatActivity {

   Product product;

    private TextView productManufacturer, productModel, productPrice, productDescription;

    private ImageView productImage;

    private Gson gson;

    private SharedProductRefs sharedPreference;

    private int cartProductNumber = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        sharedPreference = new SharedProductRefs(ProductActivity.this);

        productImage = (ImageView)findViewById(R.id.full_product_image);
        productManufacturer = (TextView)findViewById(R.id.product_manufacturer);
        productModel = (TextView)findViewById(R.id.product_model);
        productPrice = (TextView)findViewById(R.id.product_price);
        productDescription = (TextView)findViewById(R.id.product_description);


        try {
            GsonBuilder builder = new GsonBuilder();
            gson = builder.create();
            String productJson = getIntent().getExtras().getString("PRODUCT");
            product = gson.fromJson(productJson, Product.class);

            if(product != null) {
                //productImage.setImageResource(product.getProductImage());
                productManufacturer.setText("Manufacturer: " + product.getManufacturer());
                productModel.setText("Model: " + product.getModel());
                productPrice.setText("Price: " + String.valueOf(new Double(product.getPrice()).intValue()) + " $");
                productDescription.setText("Description: \n " + product.getDescription());

            }
        }
        catch (RuntimeException ex){
            System.out.println(ex.getStackTrace());
        }

        Button addToCartButton = (Button)findViewById(R.id.add_to_cart);
        addToCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String productsFromCart = sharedPreference.retrieveProductFromCart();

                if(productsFromCart.equals("")){
                    List<Product> cartProductList = new ArrayList<Product>();
                    cartProductList.add(product);
                    String cartValue = gson.toJson(cartProductList);
                    sharedPreference.addProductToTheCart(cartValue);
                    cartProductNumber = cartProductList.size();
                }else{
                    String productsInCart = sharedPreference.retrieveProductFromCart();
                    Product[] storedProducts = gson.fromJson(productsInCart, Product[].class);

                    List<Product> allNewProduct = convertObjectArrayToListObject(storedProducts);
                    allNewProduct.add(product);
                    String addAndStoreNewProduct = gson.toJson(allNewProduct);
                    sharedPreference.addProductToTheCart(addAndStoreNewProduct);
                    cartProductNumber = allNewProduct.size();
                }
                sharedPreference.addProductCount(cartProductNumber);
                //invalidateCart();
            }
        });

        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductActivity.this, CartActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

    }

    private void invalidateCart() {
        invalidateOptionsMenu();
    }

    private List<Product> convertObjectArrayToListObject(Product[] storedProducts) {
        List<Product> mProduct = new ArrayList<Product>();
        Collections.addAll(mProduct, storedProducts);
        return mProduct;
    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem menuItem = menu.findItem(R.id.action_shop);
        int mCount = sharedPreference.retrieveProductCount();
        menuItem.setIcon(buildCounterDrawable(mCount, R.drawable.cart));
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_shop) {
            Intent checkoutIntent = new Intent(ProductActivity.this, CartActivity.class);
            startActivity(checkoutIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private Drawable buildCounterDrawable(int count, int backgroundImageId) {
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.activity_store, null);
        view.setBackgroundResource(backgroundImageId);

        if (count == 0) {
            View counterTextPanel = view.findViewById(R.id.counterValuePanel);
            counterTextPanel.setVisibility(View.GONE);
        } else {
            TextView textView = (TextView) view.findViewById(R.id.count);
            textView.setText("" + count);
        }

        view.measure(
                View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED),
                View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());

        view.setDrawingCacheEnabled(true);
        view.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);
        Bitmap bitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);

        return new BitmapDrawable(getResources(), bitmap);
    }
    */
}
