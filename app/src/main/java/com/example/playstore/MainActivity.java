package com.example.playstore;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.playstore.ui.dashboard.DashboardFragment;
import com.example.playstore.ui.homefragment.AppsFragment;
import com.example.playstore.ui.homefragment.BooksFragment;
import com.example.playstore.ui.homefragment.GameFragment;
import com.example.playstore.ui.homefragment.MoviesFragment;

public class MainActivity extends FragmentActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        GameFragment fragment = new GameFragment();
        fragmentTransaction.add(R.id.menu_view_group, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onBackPressed() {

        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    public void drawNavigation(View view)
    {
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        if(!drawerLayout.isDrawerOpen(GravityCompat.START)) drawerLayout.openDrawer(GravityCompat.START);
//        Intent intent = new Intent(this, Main3Activity.class);
//        startActivity(intent);
    }

    public void gamesMenuClick(MenuItem item) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        GameFragment fragment = new GameFragment();
        fragmentTransaction.replace(R.id.menu_view_group, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void appsMenuClick(MenuItem item) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        AppsFragment fragment = new AppsFragment();
        fragmentTransaction.replace(R.id.menu_view_group, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void moviesMenuClick(MenuItem item) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        MoviesFragment fragment = new MoviesFragment();
        fragmentTransaction.replace(R.id.menu_view_group, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void booksMenuClick(MenuItem item) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        BooksFragment fragment = new BooksFragment();
        fragmentTransaction.replace(R.id.menu_view_group, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
