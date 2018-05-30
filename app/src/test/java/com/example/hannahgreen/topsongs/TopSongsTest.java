package com.example.hannahgreen.topsongs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TopSongsTest {

    @Test
    public void getListTest() {
        TopSongs topSongs = new TopSongs();
        assertEquals(20, topSongs.getList().size());
    }
}
