package com.example.hannahgreen.topsongs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SongTest {

    Song song;

    @Before
    public void before(){
        song = new Song(3, "No Tears Left To Cry", "Ariana Grande");
    }

    @Test
    public void getRankingTest() {
        assertEquals((Integer)3, song.getRanking());

    }

    @Test
    public void getTitleTest(){
        assertEquals("No Tears Left To Cry", song.getTitle());
    }

    @Test
    public void getArtistTest(){
        assertEquals("Ariana Grande", song.getArtist());
    }
}
