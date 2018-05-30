package com.example.hannahgreen.topsongs;

import java.util.ArrayList;

public class TopSongs {
    private ArrayList<Song> list;

    public TopSongs(){
        list = new ArrayList<Song>();
        list.add(new Song(1, "One Kiss", "Calvin Harris & Dua Lipa"));
        list.add(new Song(2, "Nice For What", "Drake"));
        list.add(new Song(3, "No Tears Left To Cry", "Ariana Grande"));
        list.add(new Song(4, "2002", "Anne-Marie"));
        list.add(new Song(5, "Answerphone", "Banx & Ranx & Ella Eyre"));
        list.add(new Song(6, "I'll Be There", "Jess Glynne"));
        list.add(new Song(7, "Flames", "David Guetta & Sia"));
        list.add(new Song(8, "Paradise", "George Ezra"));
        list.add(new Song(9, "This Is America", "Childish Gambino"));
        list.add(new Song(10, "Better Now", "Post Malone"));
        list.add(new Song(11, "Lullaby", "Sigala"));
        list.add(new Song(12, "Solo", "Clean Bandit"));
        list.add(new Song(13, "German", "EO"));
        list.add(new Song(14, "Love Lies", "Khalid"));
        list.add(new Song(15, "Freaky Friday", "Lil Dicky"));
        list.add(new Song(16, "Psycho", "Post Malone"));
        list.add(new Song(17, "The Middle", "Zedd & Grey"));
        list.add(new Song(18, "In My Blood", "Shawn Mendes"));
        list.add(new Song(19, "I Like It", "Cardi B, Bad Bunny & J Balvin"));
        list.add(new Song(20, "Bad Vibe", "M.O, Mr. Eazi & Lotto Boyzz"));

    }

    public ArrayList<Song> getList() {
        return new ArrayList<Song>(list);
    }
}
