package com.example.ps_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import java.util.UUID;

public class MainActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        UUID taskId = getIntent().getSerializableExtra(TaskListFragment.KEY_EXTRA_TASK_ID, UUID.class);
        return TaskFragment.newInstance(taskId);
    }
}