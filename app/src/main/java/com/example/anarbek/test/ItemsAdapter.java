package com.example.anarbek.test;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemViewHolder> {

    private List<Event> data = new ArrayList<>();

    public ItemsAdapter() {
        createData();
    }

    @Override
    public ItemsAdapter.ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemsAdapter.ItemViewHolder holder, int position) {
        Event record = data.get(position);
        holder.applyData(record);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    private void createData() {
        data.add(new Event("Феминале", "31.01"));
        data.add(new Event("Соц реал", "01.04"));
        data.add(new Event("Ван гог", "04.01"));
        data.add(new Event("Хлеб", "12.11"));
        data.add(new Event("Твист Роуз", "01.05"));
        data.add(new Event("", "21.05"));
        data.add(new Event("Чокморов", "09.09"));
        data.add(new Event("Кыргыз эли", "01.01"));
        data.add(new Event("Лего Тысячелетний сокол", "01.04"));
        data.add(new Event("Монитор", "25.01"));
        data.add(new Event("MacBook Pro", "01.10"));
        data.add(new Event("Шоколадка", "01.04"));
        data.add(new Event("Шкаф", "10.10"));
        data.add(new Event("Молоко", "03.05"));
        data.add(new Event("Жизнь", "01.08"));
        data.add(new Event("Курсы", "05.07"));
    }


    static class ItemViewHolder extends RecyclerView.ViewHolder {

        private final TextView title;
        private final TextView price;

        public ItemViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            price = itemView.findViewById(R.id.price);
        }

        public void applyData(Event record) {
            title.setText(record.getName());
            price.setText(record.getDate());
        }
    }
}
