package music.string;
import music.*;
import musicc.Playable;
public class Veena implements Playable {
    @Override
    public void play(){
        System.out.println("Veena plays string");
    }
}