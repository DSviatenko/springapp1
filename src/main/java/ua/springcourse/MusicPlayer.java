package ua.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;

    public MusicPlayer (List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer () {}

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playing() {
        for(Music music : musicList){
            System.out.println("Playing: " + music.getSong());
        }
    }
}
