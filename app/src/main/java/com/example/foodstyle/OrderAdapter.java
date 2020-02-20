package com.example.foodstyle;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder> {


    private ArrayList<OrderList> orderLists;

    public static class OrderViewHolder extends RecyclerView.ViewHolder{

        public TextView text,qtext,ptext;

        public OrderViewHolder(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.text);
            qtext= itemView.findViewById(R.id.textView15);
            ptext= itemView.findViewById(R.id.textView16);

        }
    }

    public OrderAdapter(ArrayList<OrderList> exampleList){
        orderLists = exampleList;
    }

    @NonNull
    @Override
    public OrderAdapter.OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_order_list, parent, false);
        OrderViewHolder evh = new OrderViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull OrderAdapter.OrderViewHolder holder, int position) {
//        rollNo.setText(Integer.toString(items[position].getRollNo()));
//        holder.text.setText(String.toString(orderLists.get(position).getText()));
        holder.text.setText(String.valueOf(orderLists.get(position).getText()));
        holder.qtext.setText(String.valueOf(orderLists.get(position).getQText()));
        holder.ptext.setText(String.valueOf(orderLists.get(position).getPText()));

    }

    @Override
    public int getItemCount() {
        return orderLists.size();
    }
}
