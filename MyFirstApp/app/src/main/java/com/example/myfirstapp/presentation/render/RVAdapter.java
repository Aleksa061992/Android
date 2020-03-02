package com.example.myfirstapp.presentation.render;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfirstapp.R;
import com.example.myfirstapp.RecyclerItem;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.RecycleItemsHolder>{
    public static class RecycleItemsHolder extends RecyclerView.ViewHolder {
        TextView word;
        TextView translate;

      public   RecycleItemsHolder(View itemView) {
            super(itemView);
            word = itemView.findViewById(R.id.word);
            translate = itemView.findViewById(R.id.translate);
          //  word.setOnClickListener((v) -> listener.);
        }

        public void bind(RecyclerItem item){
           // word.setText(translate.get);
           this.word.setText(item.getWord());
           this.translate.setText(item.getTranslate());
        }
    }

    private List<RecyclerItem> item;
    private RecyclerItem listener;
    public RVAdapter(List<RecyclerItem> item){
        this.item = item;
    }
    @Override

    public int getItemCount() {
        return item.size();
    }

    @Override
    public RecycleItemsHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.word_and_translate, viewGroup, false);
        RecycleItemsHolder pvh = new RecycleItemsHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(RecycleItemsHolder recycleItemHolder, int i) {
        RecyclerItem item = this.item.get(i);
        recycleItemHolder.bind(item);
    }

    public void setData(List<RecyclerItem> item){
        this.item = item;
    }
}