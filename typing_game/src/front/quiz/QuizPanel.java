package front.quiz;

import javax.swing.*;
import java.awt.*;

public class QuizPanel extends JPanel {
    public QuizPanel(){
        this.setLayout(null);
        this.setBackground(Color.red);
    }

    public void prepareComponents(){
        JLabel quizLabel = new JLabel();
        quizLabel.setText("ゲーム");
        quizLabel.setBounds(100, 0, 100, 30);
        this.add(quizLabel);

    }
}
