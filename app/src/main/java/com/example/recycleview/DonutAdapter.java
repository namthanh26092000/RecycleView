package com.example.recycleview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DonutAdapter extends RecyclerView.Adapter<DonutAdapter.ThingViewHolder> {
    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<Donut> donut;
    public DonutAdapter(Context context,ArrayList<Donut> donut){
    layoutInflater =LayoutInflater.from(context);
    this.context=context;
    this.donut=donut;

    }
    @NonNull
    @Override
    public DonutAdapter.ThingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item =layoutInflater.inflate(R.layout.item_donut,parent,false);

        return new ThingViewHolder(item,this);



    }

    @Override
    public void onBindViewHolder(@NonNull ThingViewHolder holder, int position) {
    Donut banhdonut = donut.get(position);
    holder.txtTen.setText(banhdonut.getTen());
    holder.txtmota.setText(banhdonut.getMota());
    holder.txtgia.setText(banhdonut.getGia());
    holder.img.setImageResource(banhdonut.getImg());
    holder.img.setOnClickListener(new View.OnClickListener() {


        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, DonutDetail.class);
            intent.putExtra("img", donut.get(position).getImg());
            intent.putExtra("ten", donut.get(position).getTen());
            intent.putExtra("gia", donut.get(position).getGia());
            intent.putExtra("mota", donut.get(position).getMota());

            context.startActivity(intent);
            }
        });

        }



    @Override
    public int getItemCount() {
        return donut.size();
    }
    public void filterList(ArrayList<Donut> filterDonut){
        donut = filterDonut;
        notifyDataSetChanged();
    }

    public class ThingViewHolder extends RecyclerView.ViewHolder {
        TextView txtTen, txtgia, txtmota;
        ImageView img;
        DonutAdapter donutAdapter;

        public ThingViewHolder(@NonNull View itemView, DonutAdapter donutAdapter) {
            super(itemView);
            img = itemView.findViewById(R.id.donut);
            txtTen = itemView.findViewById(R.id.tenbanh);
            txtgia = itemView.findViewById(R.id.price);
            txtmota = itemView.findViewById(R.id.mota1);

            this.donutAdapter = donutAdapter;
        }


        }
    }



