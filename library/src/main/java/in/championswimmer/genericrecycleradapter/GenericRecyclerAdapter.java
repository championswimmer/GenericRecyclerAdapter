package in.championswimmer.genericrecycleradapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by championswimmer on 22/01/18.
 */

public class GenericRecyclerAdapter<T> extends RecyclerView.Adapter {

    public interface OnItemBindListener<I> {
        void onBind(View itemView, I item);
    }

    private ArrayList<T> itemList;
    private int layoutId;
    private OnItemBindListener<T> onItemBindListener;

    public GenericRecyclerAdapter(ArrayList<T> itemList, int layoutId, OnItemBindListener<T> onItemBindListener) {
        this.itemList = itemList;
        this.layoutId = layoutId;
        this.onItemBindListener = onItemBindListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater li = (LayoutInflater) parent.getContext().getSystemService(
                Context.LAYOUT_INFLATER_SERVICE
        );


        return new GenericViewHolder(li.inflate(layoutId, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (onItemBindListener != null) {
            onItemBindListener.onBind(holder.itemView, itemList.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    class GenericViewHolder extends RecyclerView.ViewHolder {

        GenericViewHolder(View itemView) {
            super(itemView);
        }
    }
}
