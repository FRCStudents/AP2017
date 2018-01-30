import java.io.File;
import java.io.IOException;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

class TrySound {
public static void main(String [] argv){
    String bip = "bip.mp3";
    Media hit = new Media(new File(bip).toURI().toString());
    MediaPlayer mediaPlayer = new MediaPlayer(hit);
    mediaPlayer.play();
    }
}
