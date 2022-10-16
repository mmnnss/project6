import javax.swing.*;
public class A9 {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setSize(1000,1000);
        f.setVisible(true);
        Drow d=new Drow();
        f.add(d);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
