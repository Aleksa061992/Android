package com.example.translateapp.presentation.render;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import com.example.translateapp.R;
import com.example.translateapp.Translate;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.TranslateHolder> {

    public static class TranslateHolder extends RecyclerView.ViewHolder  {
        TextView word;
        TextView translate;

        public TranslateHolder(View itemView) {
            super(itemView);
            word = itemView.findViewById(R.id.word);
            translate = itemView.findViewById(R.id.translate);

            itemView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v) {
                }
            });
        }

        public void bind(Translate item) {
            this.word.setText(item.getWord());
            this.translate.setText(item.getTranslate());

            itemView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v) {
                }
            });

        }


    }

    private List<Translate> item;
    private LayoutInflater inflater;
    private Translate listener;

    public RVAdapter(List<Translate> item) {
        this.item = item;
    }

    @Override

    public int getItemCount() {
        return item.size();
    }

    @Override
    public TranslateHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.word_and_translate, viewGroup, false);
        TranslateHolder pvh = new TranslateHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(TranslateHolder translateHolder, int i) {
        Translate item = this.item.get(i);

        translateHolder.word.setText(item.getWord());
        translateHolder.translate.setText(item.getTranslate());
    }

    public void setData(List<Translate> item) {
        this.item = item;
    }
}