package front.admin;

import javax.swing.*;
import java.awt.*;

public class AdminPanel extends JPanel {
    public AdminPanel() {
        this.setLayout(null);
        this.setBackground(Color.red);
    }

    public void prepareComponents() {
        JLabel adminLabel = new JLabel();
        adminLabel.setText("管理画面");
        adminLabel.setBounds(100, 0, 100, 30);
        this.add(adminLabel);
    }
}