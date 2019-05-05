package aspect.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dancer implements Performance {
    @Autowired
    private Track track;
    public void performance() {
        System.out.println("Begin to dance, dance's name is " + track.getName()
         + "dancer is " + track.getAuthor());
    }
    public Track getTrack() {
        return track;
    }
}
