import org.code.theater.*;
import org.code.media.*;

public class ImageFilter extends ImagePlus {

  
  public ImageFilter(String fileName) {
    super(fileName);
  }

  // add filter here
   public void keepColor(String color) {
     // 0. Get the 2D array of pixel
     Pixel[][] pixels = getImagePixels();
     // 1. Traverse the 2D array of Pixels
     for (int row = 0; row < pixels.length; row++) {
       for (int col = 0; col < pixels[0].length; col++) {
         // 2. Select the current pixel in the traversal
         Pixel currentPixel = pixels[row][col];
         
         // 3. Set the color based on the parameter
         if (color.equals("red")) {
           currentPixel.setGreen(0);
           currentPixel.setBlue(0);
         } else if (color.equals("green")) {
           currentPixel.setRed(0);
           currentPixel.setBlue(0);
         } else if (color.equals("blue")) {
           currentPixel.setRed(0);
           currentPixel.setGreen(0);
         }
       }
     }
   }
public void makeNegative() {
    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Get the pixels from the image, then traverse the 2D array of pixels. Set
     * the red, green, and blue color values of each Pixel object to the result of
     * 255 minus the current values.
     * -----------------------------------------------------------------------------
     */

    Pixel[][] pixels = getImagePixels();

    for (Pixel[] row : pixels) {
      for (Pixel pixel : row) {
        int red = pixel.getRed();
        int green = pixel.getGreen();
        int blue = pixel.getBlue();
        
        pixel.setRed(255 - red);
        pixel.setGreen(255 - green);
        pixel.setBlue(255 - blue);
      }
    }
    
  }

  
}

