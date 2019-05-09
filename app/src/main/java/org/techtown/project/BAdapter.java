package org.techtown.project;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class BAdapter extends RecyclerView.Adapter<BAdapter.ViewHolder> {
    private Context context;
    private ArrayList<BImage> persons;
    private int lastPosition = -1;

    /*    ArrayList<Person> items = new ArrayList<Person>();*/
    public BAdapter(ArrayList<BImage> persons, Context context) {
        this.persons = persons;
        this.context = context;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        /*Button button;*/
        public ViewHolder(View itemView) {
            super(itemView);
           /* button = (Button) itemView.findViewById(R.id.imageView2);*/
            imageView = (ImageView) itemView.findViewById(R.id.imageView2);
        }
    }

    @NonNull
    @Override
    public BAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.badapter_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.imageView.setImageResource(persons.get(position).getImage());
    }

    public void addItem(BImage item) {
        persons.add(item);
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }
}


