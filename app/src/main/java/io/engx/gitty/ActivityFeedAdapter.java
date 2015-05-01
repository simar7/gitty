package io.engx.gitty;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Collections;

/**
 * Created by simar on 2015-01-11.
 */
public class ActivityFeedAdapter extends RecyclerView.Adapter<ActivityFeedAdapter.MyActivityViewHolder> {

    private LayoutInflater inflater;
    private Context context;
    // TODO: Replace by actual GitHub activity data.
    List<ActivityFeedData> data_list = Collections.emptyList();

    public ActivityFeedAdapter(Context context, List<ActivityFeedData> data_list) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.data_list = data_list;
    }

    @Override
    public ActivityFeedAdapter.MyActivityViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.activity_feed_row, viewGroup, false);
        MyActivityViewHolder holder = new MyActivityViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ActivityFeedAdapter.MyActivityViewHolder holder, int position) {
        ActivityFeedData currentRow = data_list.get(position);
        holder.activity_list_text.setText(currentRow.list_item_text);
        holder.activity_list_icon.setImageResource(currentRow.list_item_icon);
    }

    @Override
    public int getItemCount() {
        return data_list.size();
    }

    // Create once, recycle many times.
    class MyActivityViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView activity_list_text;
        ImageView activity_list_icon;

        public MyActivityViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            activity_list_text = (TextView) itemView.findViewById(R.id.listText);
            activity_list_icon = (ImageView) itemView.findViewById(R.id.listIcon);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
