import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SpeedTest extends Frame {
    public SpeedTest() { addWindowListener(new MyWindowAdapter());
    }

    public static void main(String[] args) throws IOException { //точка входа
        final int w = 80;
        final int h = 30;

        SpeedTest speedTest = new SpeedTest();
        speedTest.setSize(400, 300);
        speedTest.setTitle("Процесс сканирования");
        speedTest.setVisible(true);

        FileInputStream fileIn = new FileInputStream("t.txt");

        FileOutputStream fileOut = new FileOutputStream("t1.txt");

        while (fileIn.available() > 0) {
            int oneByte = fileIn.read();
            fileOut.write(oneByte);
        }
        fileIn.close();
        fileOut.close();
    }
}

    class MyWindowAdapter extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }

