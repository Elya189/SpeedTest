import javax.swing.*; //  позволяет графическим интерфейсам Java задействовать графические возможности ос
import java.awt.*; //обеспечивает взаимодействие с графической подсистемой ос
import java.io.IOException;

public class Interface extends JFrame {

    public void Draw() { // метод отрисовки графической оболочки

        setTitle("SpeedTest program"); // название графического окна
        setSize(600, 400);
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize(), fSize = getSize();
        // рассчет положения графического окна по центру экрана
        if (fSize.height > sSize.height) {
            fSize.height = sSize.height;
        }
        if (fSize.width > sSize.width) {
            fSize.width = sSize.width;
        }
        setLocation((sSize.width - fSize.width) / 2, (sSize.height - fSize.height) / 2); // вывод окна в указаном месте
        setDefaultCloseOperation(EXIT_ON_CLOSE); // обработка события (закрыть окно)

        Label d = new Label("Free space after the process: 755 GB" );
        add(d);
        setVisible(true);
    }

}





