package br.com.faculdade.my_trainning;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class BoxAdapter extends RecyclerView.Adapter<BoxAdapter.BoxViewHolder> {

    private List<String> items;
    private OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onItemClick(String item);
    }

    public BoxAdapter(List<String> items, OnItemClickListener onItemClickListener) {
        this.items = items;
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public BoxViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_box, parent, false);
        return new BoxViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BoxViewHolder holder, int position) {
        String item = items.get(position);
        holder.textView.setText(item);

        holder.itemView.setOnClickListener(v -> {
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(item);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class BoxViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public BoxViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.item_text);
        }
    }
}
