package com.google.codelabs.mdc.java.shrine;


import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.android.volley.toolbox.NetworkImageView;

public class ProductCardViewHolder extends RecyclerView.ViewHolder {

    public final NetworkImageView productImage;
    public final TextView productTitle;
    public final TextView productDesc;

    public ProductCardViewHolder(@NonNull View itemView, Context c) {
        super(itemView);
        productImage = itemView.findViewById(R.id.product_image);
        productTitle = itemView.findViewById(R.id.product_title);
        productDesc = itemView.findViewById(R.id.product_desc);

        Button hackButton = itemView.findViewById(R.id.hack);

        final Context cc = c;

        hackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(cc, productTitle.getText() + " done! Danke", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }


}