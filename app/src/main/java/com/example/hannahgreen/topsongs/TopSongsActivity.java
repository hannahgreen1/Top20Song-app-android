package com.example.hannahgreen.topsongs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_songs);

        TopSongs topSongs = new TopSongs();
        ArrayList<Song> list = topSongs.getList();

        TopSongsAdapter songsAdaptor = new TopSongsAdapter(this, list);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songsAdaptor);
    }

    public void onListItemClick(View listItem){
        Song song = (Song) listItem.getTag();
        Log.d("Song Title: ", song.getTitle());

        Intent intent = new Intent(this, SongActivity.class);
        intent.putExtra("song", song);
        startActivity(intent);

    }
}
