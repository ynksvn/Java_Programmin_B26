package day44_custom_classes;

import day44_custom_classes.Song;

public class UsedSong {
    public static void main(String[] args) {


        Song song1 = new Song("waka waka");
        System.out.println(song1);

        Song song2 = new Song("viva la vida", 3.5);
        System.out.println(song2);

        Song song3 = new Song("Thriller", 4.0, "Michael Jackson", "Pop");
        System.out.println(song3);


    }


}
