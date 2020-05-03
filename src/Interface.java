import javax.swing.*; //  позволяет графическим интерфейсам Java задействовать графические возможности ос
import java.awt.*; //обеспечивает взаимодействие с графической подсистемой ос
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface extends JFrame {

    public void Draw() { // метод отрисовки графической оболочки

        setTitle("SpeedTest program"); // название графического окна
        setSize(new Dimension(600, 400)); // размер графического окна
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
        setVisible(true); // сделать окно видимым

    }

    public class Test extends JFrame {
        JButton button;
        JLabel l1,l2,l3,l4;
        JTextField t1, t2;
        String a, b;
        Runner run = new Runner();

        public Test(String s) {
            super(s);
            setLayout(new FlowLayout());
            button = new JButton("Start");

            l1 = new JLabel("Total size: ");
            l2 = new JLabel("Space free: ");
            l3=new JLabel ("");
            l4=new JLabel ("");
            t1 = new JTextField(20);
            t2 = new JTextField(20);
            add(button);
            add(l1);
            add(l2);
            add(l3);
            add(l4);
            add(t1);
            add(t2);
            button.addActionListener(run);
        }

        public class Runner implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (e.getSource() == button)

                        l2.setText(a);
                    l3.setText(b);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Введите в поле число.");
                }

            }
        }
    }
}

