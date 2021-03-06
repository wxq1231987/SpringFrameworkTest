package aspect.test;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class Track {
    private String name;
    private String author;
    private byte[] audio;

    public Track() {
        super();
        this.name = "二泉映月";
        this.author = "阿炳";
        this.audio = new byte[100];
    }

    public Track(String name, String author, byte[] audio) {
        super();
        this.name = name;
        this.author = author;
        this.audio = audio;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public byte[] getAudio() {
        return audio;
    }
    public void setAudio(byte[] audio) {
        this.audio = audio;
    }

    @Override
    public String toString() {
        return "Track [name=" + name + ", author=" + author + ", audio=" + Arrays.toString(audio) + "]";
    }
}
