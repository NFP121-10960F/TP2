package question3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class IHM extends JFrame {

    public static float fahrenheitEnCelsius(int f) {
        float converted = ((int) (5 / 9f * (f - 32) * 10) / 10.0f);
        return converted; 
    }

    public IHM() {
        setVisible(true);
        setSize(400, 120);
        setLayout(null);
        JTextField FT = new JTextField();
        JTextField CT = new JTextField();
        CT.setEnabled(false);
        JButton convert = new JButton("Convert");
        add(FT).setBounds(20, 20, 100, 42);
        add(CT).setBounds(260, 20, 100, 42);
        add(convert).setBounds(140, 20, 100, 42);
        convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    int f = Integer.parseInt(FT.getText());
                    CT.setText(String.valueOf(fahrenheitEnCelsius(f)));
                } catch (NumberFormatException e) {
                    CT.setText(String.valueOf("Error"));
                }

            }
        });

    }

}
