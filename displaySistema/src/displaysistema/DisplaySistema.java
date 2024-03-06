package displaysistema;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class DisplaySistema {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gs = ge.getScreenDevices();
        
        for (GraphicsDevice g : gs) {
            System.out.println("Tamanho da tela:" + g.getDisplayMode().getWidth() + "x" + g.getDisplayMode().getHeight());
        }
    }
}

