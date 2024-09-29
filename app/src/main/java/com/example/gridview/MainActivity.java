package com.example.gridview;

import android.os.Bundle;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    String[] gridLabels = {
            "Camera", "Camera Roll", "Featured",
            "My Videos", "Likes", "Watch Later",
            "Stats", "Subscriptions", "Help"
    };

    int[] gridImages = {
            R.drawable.ic_camera, R.drawable.ic_camera_roll, R.drawable.ic_featured,
            R.drawable.ic_my_videos, R.drawable.ic_likes, R.drawable.ic_watch_later,
            R.drawable.ic_stats, R.drawable.ic_subscription, R.drawable.ic_help
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.grid_view);

        CustomAdapter adapter = new CustomAdapter(this, gridLabels, gridImages);
        gridView.setAdapter(adapter);
    }
}
