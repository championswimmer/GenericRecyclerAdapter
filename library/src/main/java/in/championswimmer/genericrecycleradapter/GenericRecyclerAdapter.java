package in.championswimmer.genericrecycleradapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by championswimmer on 22/01/18.
 */

public class GenericRecyclerAdapter<T> extends RecyclerView.Adapter {
    private ArrayList<T> itemList;


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class GenericViewHolder extends RecyclerView.ViewHolder {

        public GenericViewHolder(View itemView) {
            super(itemView);
        }
    }
}
