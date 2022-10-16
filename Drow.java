//Write a graphical application that displays a checkerboard with 64 squares, alternating white and black.
import javax.swing.*;
import java.awt.*;
public class Drow extends JComponent {
    public void paintComponent(Graphics g)
    {
        Graphics2D g2=(Graphics2D) g;
        int row,col,x,y;
        for (row=15;row<23;row++)
        {
            for (col=15;col<23;col++)
            {
                x=col*25;
                y=row*25;
                if((row%2)==(col%2))
                    g2.setColor(Color.white);
                else
                    g2.setColor(Color.black);
                g2.fillRect(x,y,25,25);
            }
        }


    }
}
