import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;



public class HelloAgainApplet extends java.applet.Applet {

  Font f = new Font("Serif",Font.BOLD,28);

  public void paint(Graphics g) {
    g.setFont(f);
    g.setColor(Color.blue);
    g.drawString("The End!", 5, 40);
  }
}
