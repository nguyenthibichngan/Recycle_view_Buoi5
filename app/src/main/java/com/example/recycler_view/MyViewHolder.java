package com.example.recycler_view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    public ImageView mImageView;
    public TextView mTitleView;
    public TextView mTextView;

    public MyViewHolder(View itemView) {
        super(itemView);
        mImageView = itemView.findViewById(R.id.item_image);
        mTitleView = itemView.findViewById(R.id.item_title);
        mTextView = itemView.findViewById(R.id.item_text);

    }

}
