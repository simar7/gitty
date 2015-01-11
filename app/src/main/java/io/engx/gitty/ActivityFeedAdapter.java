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
public class ActivityFeedAdapter extends RecyclerView.Adapter<ActivityFeedAdapter.ActivityViewHolder> {

    private LayoutInflater inflater;
    private Context context;

    // TODO: Replace by actual GitHub activity data.
    List<ActivityFeed> sample_data = Collections.emptyList();

    public ActivityFeedAdapter(Context context, List<ActivityFeed> sample_data) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.sample_data = sample_data;
    }

    @Override
    public ActivityFeedAdapter.ActivityViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.activity_feed_row, viewGroup, false);
        ActivityViewHolder holder = new ActivityViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ActivityFeedAdapter.ActivityViewHolder viewHolder, int position) {

        ActivityFeed currentRow = sample_data.get(position);

        viewHolder.activity_list_text.setText(currentRow.list_item_text);
        viewHolder.activity_list_icon.setImageResource(currentRow.list_item_icon);

    }

    @Override
    public int getItemCount() {
        return sample_data.size();
    }

    // Create once, recycle many times.
    class ActivityViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView activity_list_text;
        ImageView activity_list_icon;

        public ActivityViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            activity_list_text = (TextView) itemView.findViewById(R.id.list_item_text);
            activity_list_icon = (ImageView) itemView.findViewById(R.id.list_item_icon);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
