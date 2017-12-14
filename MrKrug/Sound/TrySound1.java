import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


class TrySound1 {
      public static void main(String [] argv){
      AudioInputStream audioIn = AudioSystem.getAudioInputStream(MyClazz.class.getResource("music.wav"));
      Clip clip = AudioSystem.getClip();
      clip.open(audioIn);
      clip.start();
  }
}
