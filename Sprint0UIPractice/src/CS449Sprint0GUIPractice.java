import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CS449Sprint0GUIPractice {
    private boolean checked = false;
    private JTextPane thisIsSomeExampleTextPane;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JCheckBox checkBox1;
    private JPanel Panel;
    private JLabel Label1;
    private ButtonGroup Dropdown1;

    public CS449Sprint0GUIPractice() {

        checkBox1.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You checked the checkbox!");
                checked = !checked;
                thisIsSomeExampleTextPane.setText("Checkbox:" + checked);
            }
        });
        radioButton1.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                Label1.setText("Radio Button 1 selected");
            }
        });
        radioButton2.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                Label1.setText("Radio Button 2 selected");
            }
        });
        radioButton3.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                Label1.setText("Radio Button 3 selected");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CS449Sprint0GUIPractice");
        frame.setContentPane(new CS449Sprint0GUIPractice().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
