package io.engx.gitty;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class SampleFragment extends Fragment {

    private RecyclerView recyclerView;
    private ActivityFeedAdapter adapter;

    private static final String ARG_POSITION = "position";

    private int position;

    public static SampleFragment newInstance(int position) {

        SampleFragment f = new SampleFragment();
        Bundle b = new Bundle();
        b.putInt(ARG_POSITION, position);
        f.setArguments(b);
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        position = getArguments().getInt(ARG_POSITION);

        View rootView = inflater.inflate(R.layout.page, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.ActivityFeedRecyclerView);
        adapter = new ActivityFeedAdapter(getActivity(), getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        //ProgressBarCircular progressBarCircular = (ProgressBarCircular) rootView.findViewById(R.id.progress);
        FloatingActionButton fab = (FloatingActionButton) rootView.findViewById(R.id.fabButton);
        fab.setDrawableIcon(getResources().getDrawable(R.drawable.plus));
        switch (position) {
            case 0:
                fab.setBackgroundColor(getResources().getColor(R.color.material_deep_teal_500));
                //progressBarCircular.setBackgroundColor(getResources().getColor(R.color.material_deep_teal_500));
                break;
            case 1:
                fab.setBackgroundColor(getResources().getColor(R.color.red));
                //progressBarCircular.setBackgroundColor(getResources().getColor(R.color.red));

                break;
            case 2:
                //progressBarCircular.setBackgroundColor(getResources().getColor(R.color.blue));
                fab.setBackgroundColor(getResources().getColor(R.color.blue));

                break;
            case 3:
                fab.setBackgroundColor(getResources().getColor(R.color.material_blue_grey_800));
                //progressBarCircular.setBackgroundColor(getResources().getColor(R.color.material_blue_grey_800));

                break;
        }

        return rootView;
    }

    public static List<ActivityFeedData> getData() {
        List<ActivityFeedData> data = new ArrayList<>();
        int[] icons = {R.drawable.ic_launcher, R.drawable.ic_launcher};
        String[] titles = {"Sample Row 1", "Sample Row 2"};
        for (int i = 0; i < icons.length && i < titles.length; i++) {
            ActivityFeedData current = new ActivityFeedData();
            current.list_item_icon = icons[i % icons.length];
            current.list_item_text = titles[i % titles.length];
            data.add(current);
        }
        return data;
    }
}