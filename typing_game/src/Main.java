import front.window.MainWindow;
import front.screen_mode.ScreenMode;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Main {
    public static void main (String args[]) {
        MainWindow.getInstance(ScreenMode.TITLE);
    }
}

