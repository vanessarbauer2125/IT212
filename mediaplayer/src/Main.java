import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       List<MediaPlayer> l = new LinkedList<MediaPlayer>();
       l.add(new AudioPlayer());
       l.add(new VideoPlayer());
       l.add(new StreamingPlayer());

       for (MediaPlayer mp : l) {
           mp.play();
           mp.pause();
           mp.stop();
           System.out.println();
       }
    }
}