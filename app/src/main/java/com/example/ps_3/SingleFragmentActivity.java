package com.example.ps_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public abstract class SingleFragmentActivity extends AppCompatActivity {

    protected FragmentManager fragmentManager = getSupportFragmentManager();
    protected Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container);
    protected abstract Fragment createFragment();
}
