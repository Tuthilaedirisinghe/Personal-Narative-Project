import org.code.theater.*;
import org.code.media.*;

public class MyStory extends Scene {

  public MyStory() {
    
  }
  public void drawScene(){
    drawBMWScene();
    drawChevroleteScene();
  }


  public void drawBMWScene() {
    setTextHeight(30);
    setTextColor("white");
    setTextStyle(Font.SANS, FontStyle.BOLD);
    
    drawText("BMW", 15,35);
    
    ImageFilter i8 = new ImageFilter("bmwi8.jpeg");
    i8.keepColor("blue");
    pause(2);
    drawImage(i8, 0, 40, 400);
    pause(0.5);
    clear("white");
    ImageFilter M4 = new ImageFilter("bmwm4.jpeg");
    M4.makeNegative();
    pause(2);
    drawImage(M4, 0, 40, 400);
  }
    
  public void drawChevroleteScene() {
    setTextHeight(30);
    setTextColor("white");
    setTextStyle(Font.SANS, FontStyle.BOLD);
    
    drawText("Chevrolet", 15,35);
    
    ImageFilter CorvetteC8 = new ImageFilter("CorvetteC8.jpg");
    CorvetteC8.keepColor("black");
    pause(2);
    drawImage(CorvetteC8, 0, 40, 400);
    pause(0.5);
    clear("white");
    ImageFilter CamaroSS = new ImageFilter("CamaroSS.jpg");
    CamaroSS.keepColor("yellow");
    pause(2);
    drawImage(CamaroSS, 0, 40, 400);
  }
   
   
   
   
}