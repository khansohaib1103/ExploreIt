package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.myapplication.Fragment.HomeFragment;
import com.example.myapplication.Fragment.NotificationFragment;
import com.example.myapplication.Fragment.PostFragment;
import com.example.myapplication.Fragment.ProfileFragment;
import com.example.myapplication.Fragment.SearchFragment;

import com.example.myapplication.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout, new HomeFragment());
        transaction.commit();

        binding.bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                switch (item.getTitle().toString()){
                    case "Home":
                        transaction.replace(R.id.frameLayout, new HomeFragment());
                        break;
                    case "Notification":
                        transaction.replace(R.id.frameLayout, new NotificationFragment());
                        break;
                    case "Add Post":
                        transaction.replace(R.id.frameLayout, new PostFragment());
                        break;
                    case "Search":
                        transaction.replace(R.id.frameLayout, new SearchFragment());
                        break;
                    case "Profile":
                        transaction.replace(R.id.frameLayout, new ProfileFragment());
                        break;


                }
                transaction.commit();

                return true;
            }
        });
    }
}