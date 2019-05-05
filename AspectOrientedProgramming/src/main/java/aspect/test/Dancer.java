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
    public void introduce() {
        System.out.println("我没有才艺");
    }
    public void introduce(Account account) {
        System.out.println("我的才艺" + account.getAcquire());
    }
    public void showGratitude(Track track, Account account) {
        System.out.println(account.getName() + "表示感谢");
    }
    public Track getTrack() {
        return track;
    }
    public void setTrack(Track track) {
        this.track = track;
    }
}
