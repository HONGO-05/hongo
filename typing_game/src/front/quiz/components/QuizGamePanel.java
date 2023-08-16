package front.quiz.components;

import front.quiz.QuizPanel;
import front.screen_mode.ScreenMode;
import front.window.MainWindow;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;


public class QuizGamePanel extends JPanel{
    ImageIO img;
    JTextField answerText;
    ArrayList<String> answer = new ArrayList<>();
    ArrayList<String> question = new ArrayList<>();

    static int quizNum = 10;
    static int count = 0;



    public QuizGamePanel() {
        this.setLayout(null);
    }

    public void prepareComponents(){
//        MyKeyListener myKeyListener = new MyKeyListener(this);
        answerText = new JTextField();
        answerText.setBounds(160, 300, 400, 70);
        answerText.setFont(new Font("ヒラギノ角ゴ ProN", Font.BOLD, 20));

        JButton btn_clear = new JButton("clear");
        btn_clear.setBounds(350, 240,200, 50);
        btn_clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                answerText.getText();
                answerText.setText("");
            }
        });

        ImageIcon icon = new ImageIcon(System.getProperty("user.dir") + "/src/image/game_background.gif");
        JLabel backGroundLabel = new JLabel(icon);
        backGroundLabel.setBounds(0, 0, 720, 540);

        this.add(answerText);
        this.add(btn_clear);
        this.add(backGroundLabel);
    }

    public ArrayList<String> questionList(){
        ArrayList<String> questions = new ArrayList<>();
        questions.add("サモエド");
        questions.add("ボルゾイ");
        questions.add("柴犬");
        questions.add("ジャックラッセルテリア");
        questions.add("ポメラニアン");
        questions.add("ミニチュア・シュナウザー");
        questions.add("ウェルシュ・コーギー・ペンブローク");
        questions.add("パグ");
        questions.add("ビション・フリーゼ");
        questions.add("バセット・ハウンド");
        return questions;
    }


//    public int judge(ArrayList<String> answers){
//        ArrayList<String> question = this.questionList();
//        for (int i = 0; i < quizNum; i++){
//            if (question.get(i).equals(answers.get(i))) {
//               count++;
//            }
//        }
//        return count;
//    }

//    private class MyKeyListener implements KeyListener{
//        QuizGamePanel quizGamePanel;
//        MyKeyListener(QuizGamePanel q){
//            super();
//            quizGamePanel = q;
//            quizGamePanel.addKeyListener(this);
//        }
//        @Override
//        public void keyTyped(KeyEvent e) {
//            switch (e.getKeyCode()){
//                case KeyEvent.VK_ENTER:
//                    answer.add(answerText.getText());
//                    answerText.setText("テスト");
//                    count++;
//                    break;
//            }
//        }
//
//        @Override
//        public void keyPressed(KeyEvent e) {
//        }
//        @Override
//        public void keyReleased(KeyEvent e) {
//        }
//    }

}
