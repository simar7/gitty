package io.engx.gitty;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by simar on 2015-01-11.
 */
public class ActivityFeedAdapter extends RecyclerView.Adapter<ActivityFeedAdapter.ActivityViewHolder> {

    private LayoutInflater inflater;

    public ActivityFeed(Context context) {
        inflater = LayoutInflater.from(context);
    }

    @Override
    public ActivityFeedAdapter.ActivityViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.activity_feed_row, viewGroup, false);
        ActivityViewHolder holder = new ActivityViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ActivityFeedAdapter.ActivityViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    // Create once, recycle many times.
    class ActivityViewHolder extends RecyclerView.ViewHolder {

        TextView activity_list_text;
        ImageView activity_list_icon;

        public ActivityViewHolder(View itemView) {
            super(itemView);
            activity_list_text = (TextView) itemView.findViewById(R.id.list_item_text);
            activity_list_icon = (ImageView) itemView.findViewById(R.id.list_item_icon);
        }
    }
}
