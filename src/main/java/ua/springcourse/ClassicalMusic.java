package ua.springcourse;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    private String[] classicalMusicList = {"Für Elise (For Elise) – Ludwig Van Beethoven",
            "'Der Hölle Rache Kocht in Meinem Herzen (Hell's Vengeance Boils in My Heart) – Wolfgang Amadeus Mozart",
            "The Creation - Joseph Haydn"};

    @Override
    public String getSong() {
        Random random = new Random();
        return classicalMusicList[random.nextInt(3)];
    }
}
