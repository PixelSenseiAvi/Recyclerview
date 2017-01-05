package com.yoavi.cart1;

import android.content.Context;
import android.content.res.Resources;
import android.provider.Settings;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Chikki on 1/1/2017.
 */
public class RecyclerAdapter extends android.support.v7.widget.RecyclerView.Adapter<RecyclerView.ViewHolder>{

    public ImageView itemImage;
    public TextView itemTitle;
    public TextView itemDetail;


    private Context context;
    public String[] title;
    public String[] description;

    public int[] images={
            R.mipmap.one,
            R.mipmap.two,
            R.mipmap.three,
            R.mipmap.four,
            R.mipmap.five,
            R.mipmap.six
    };

    public RecyclerAdapter(Context context,String[] title,String[] description) {
        this.context=context;
        LayoutInflater.from(context);
        this.title = title;
        this.description=description;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CardView mCardView;
        public ViewHolder(View itemView) {

            super(itemView);
            mCardView =(CardView)itemView;
            itemImage = (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle = (TextView)itemView.findViewById(R.id.title);
            itemDetail =
                    (TextView)itemView.findViewById(R.id.descriptor);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int position = getAdapterPosition();

                }
            });
        }
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        CardView cardView = (CardView) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.productcard,viewGroup,false);

        return new ViewHolder(cardView);

    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        try {
            CardView cardView = (CardView) holder.itemView;
            TextView itemTitle = (TextView) cardView.findViewById(R.id.title);
            itemTitle.setText(title[position]);
            TextView itemDetail = (TextView) cardView.findViewById(R.id.descriptor);
            itemDetail.setText(description[position]);
            ImageView itemImage = (ImageView) cardView.findViewById(R.id.item_image);
            itemImage.setImageResource(images[position]);
        }catch (Exception e){
            System.out.print(e.getMessage());

        }
        }


    @Override
    public int getItemCount() {
        return title.length;
    }
}
