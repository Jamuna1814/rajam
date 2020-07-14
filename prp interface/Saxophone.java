package music.wind;
import musicc.*;
import musicc.Playable;
public class Saxophone implements Playable {
    @Override
    public void play(){
        System.out.println("Saxphone plays wind");
    }
}