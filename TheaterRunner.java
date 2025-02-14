import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

 // Creates a Scene object
    MyStory scene = new MyStory();

    scene.drawScene();

    Theater.playScenes(scene);
  
  }
}