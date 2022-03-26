package com.example.myapplication.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.Adapter.NotificationAdapter;
import com.example.myapplication.Model.NotificationModel;
import com.example.myapplication.R;

import java.util.ArrayList;


public class Notification2Fragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<NotificationModel> list;

    public Notification2Fragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notification2, container, false);
         recyclerView = view.findViewById(R.id.notification2RV);
         list = new ArrayList<>();
         list.add(new NotificationModel(R.drawable.zia_bhai, "<b>Raja Zia ul Haq</b> mention you in a comment", "just now"));
        list.add(new NotificationModel(R.drawable.tuahadp, "<b>Tuaha Ibn Jalil</b> mention you in a comment", "just now"));
        list.add(new NotificationModel(R.drawable.haider_dp, "<b>Haider Kaiser Satti</b> mention you in a comment", "just now"));
        list.add(new NotificationModel(R.drawable.khurramdp, "<b>Khurram Alvi</b> mention you in a comment", "just now"));
        list.add(new NotificationModel(R.drawable.zia_bhai, "<b>Raja Zia ul Haq</b> mention you in a comment", "just now"));
        list.add(new NotificationModel(R.drawable.tuahadp, "<b>Tuaha Ibn Jalil</b> mention you in a comment", "just now"));
        list.add(new NotificationModel(R.drawable.haider_dp, "<b>Haider Kaiser Satti</b> mention you in a comment", "just now"));
        list.add(new NotificationModel(R.drawable.khurramdp, "<b>Khurram Alvi</b> mention you in a comment", "just now"));
        list.add(new NotificationModel(R.drawable.zia_bhai, "<b>Raja Zia ul Haq</b> mention you in a comment", "just now"));
        list.add(new NotificationModel(R.drawable.tuahadp, "<b>Tuaha Ibn Jalil</b> mention you in a comment", "just now"));
        list.add(new NotificationModel(R.drawable.haider_dp, "<b>Haider Kaiser Satti</b> mention you in a comment", "just now"));
        list.add(new NotificationModel(R.drawable.khurramdp, "<b>Khurram Alvi</b> mention you in a comment", "just now"));



        NotificationAdapter adapter = new NotificationAdapter(list, getContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
        return view;
    }
}