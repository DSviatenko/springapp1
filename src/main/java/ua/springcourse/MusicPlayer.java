package ua.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;
    private int volume;

    public MusicPlayer (List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer () {}

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playing() {
        for(Music music : musicList){
            System.out.println("Playing: " + music.getSong());
        }
    }
}
