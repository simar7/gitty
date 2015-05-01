package io.engx.gitty;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by simar on 2015-04-30.
 */
public class ActivityFeedFragment extends Fragment {

    private RecyclerView recyclerView;
    private ActivityFeedAdapter activityFeedAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View layout = inflater.inflate(R.layout.activity_feed_row, container, false);
        recyclerView = (RecyclerView) layout.findViewById(R.id.activity_feed);
        activityFeedAdapter = new ActivityFeedAdapter(getActivity(), getData());
        recyclerView.setAdapter(activityFeedAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return layout;
    }

    public static List<ActivityFeedData> getData() {

        List<ActivityFeedData> dataList = new ArrayList<>();
        int[] icons = {R.drawable.ic_launcher, R.drawable.ic_launcher};
        String[] titles = {"simar", "nymi"};
        for (int i = 0; i < titles.length && i < icons.length; i++) {
            ActivityFeedData current = new ActivityFeedData();
            current.list_item_icon = icons[i];
            current.list_item_text = titles[i];
            dataList.add(current);
        }
        return dataList;
    }
}
