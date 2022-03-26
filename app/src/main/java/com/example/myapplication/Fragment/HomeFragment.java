package com.example.myapplication.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.Adapter.DashboardAdapter;
import com.example.myapplication.DashboardModel;
import com.example.myapplication.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment  {

    RecyclerView dashboardRv;
    ArrayList<DashboardModel> dashboardList;


    public HomeFragment() {
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        dashboardRv = view.findViewById(R.id.dashboardRv);
        dashboardList = new ArrayList<>();

        dashboardList .add(new DashboardModel(R.drawable.zia_bhai, R.drawable.ziapost,
                "Raja Zia Ul Haq", "Islamic Scholar", "100", "26", "3"));

        dashboardList .add(new DashboardModel(R.drawable.tuahadp, R.drawable.tuahabhai,
                "Tuaha Ibn Jalil", "Motivational Speaker", "100", "26", "3"));

        dashboardList .add(new DashboardModel(R.drawable.haider_dp, R.drawable.haiderpost,
                "Haider Kaiser Satti", "Builders", "100", "26", "3"));

        dashboardList .add(new DashboardModel(R.drawable.khurramdp, R.drawable.khurrampost,
                "Khurram Alvi", "Businessman", "100", "26", "3"));

        DashboardAdapter dashboardAdapter = new DashboardAdapter(dashboardList, getContext());
        LinearLayoutManager layoutManager =  new LinearLayoutManager(getContext());
        dashboardRv.setLayoutManager(layoutManager);
        dashboardRv.setNestedScrollingEnabled(false);
        dashboardRv.setAdapter(dashboardAdapter);
        return view;
    }
}