package com.example.madrassaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private Context context;
    private List rollNo,name,age,Class,sabaq,sabaqi,manzil,date;
    CustomAdapter (List rollNo,
                   List name,
                   List age,
                   List Class,
                   List sabaq,
                   List sabaqi,
                   List manzil,
                   List date
                   ){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.Class = Class;
        this.sabaq = sabaq;
        this.sabaqi = sabaqi;
        this.manzil = manzil;
        this.date = date;
    }

    @NonNull
    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.my_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.MyViewHolder holder, int position) {
        holder.roll_no_txt.setText(String.valueOf(rollNo.get(position)));
        holder.name_txt.setText(String.valueOf(name.get(position)));
        holder.age_txt.setText(String.valueOf(age.get(position)));
        holder.Class_txt.setText(String.valueOf(Class.get(position)));
        holder.sabaq_txt.setText(String.valueOf(sabaq.get(position)));
        holder.sabaqi_txt.setText(String.valueOf(sabaqi.get(position)));
        holder.manzil_txt.setText(String.valueOf(manzil.get(position)));
        holder.date_txt.setText(String.valueOf(date.get(position)));
    }

    @Override
    public int getItemCount() {
        return rollNo.size(); // Update with the actual data list size
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView roll_no_txt,name_txt,age_txt,Class_txt,sabaq_txt,sabaqi_txt,manzil_txt,date_txt;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            roll_no_txt = itemView.findViewById(R.id.roll_no_data);
            name_txt = itemView.findViewById(R.id.name_data);
            age_txt = itemView.findViewById(R.id.age_data);
            Class_txt = itemView.findViewById(R.id.class_data);
            sabaq_txt = itemView.findViewById(R.id.sabaq_data);
            sabaqi_txt = itemView.findViewById(R.id.sabaqi_data);
            manzil_txt = itemView.findViewById(R.id.manzil_data);
            date_txt = itemView.findViewById(R.id.date_data);
        }

    }
}
