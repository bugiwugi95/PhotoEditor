import java.awt.image.BufferedImage;

public class RgbMater {


   private BufferedImage image;
    private int width;
    private int height;
    private boolean hasAlphaChannel;
    private int[] pixels;
    public RgbMater(BufferedImage image) {
        this.image = image;
        width = image.getWidth();
        height = image.getHeight();
        hasAlphaChannel = image.getAlphaRaster() != null;
        pixels = image.getRGB( 0, 0, height, width,null,0,height*width );
    }


   private BufferedImage getImage(){
        return image;
   }


}
