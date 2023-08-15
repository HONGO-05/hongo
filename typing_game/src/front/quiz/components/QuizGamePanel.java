package front.quiz.components;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class QuizGamePanel extends JPanel{
    ImageIO img;
    List<String> answer = new ArrayList<>();
    List<String> question = new ArrayList<>();
    static int quizNum = 10;
    static int resultCount = 0;

    public QuizGamePanel() {
        this.setLayout(null);

    }

    public ArrayList<String> questionList(){
        ArrayList<String> questions = new ArrayList<>();
        questions.add("サモエド");
        return questions;
    }

    public int judge(ArrayList<String> answers){
        ArrayList<String> question = this.questionList();
        for (int i = 0; i < quizNum; i++){
            if (question.get(i).equals(answers.get(i))) {
                resultCount++;
            }
        }
        return resultCount;
    }

    public void prepareComponents(){
        JTextField answerText = new JTextField(30);
        answerText.setBounds(160, 300, 400, 70);
        answerText.setFont(new Font("ヒラギノ角ゴ ProN", Font.BOLD, 20));
        this.add(answerText);

        answer.add(answerText.getText());

        ImageIcon icon = new ImageIcon(System.getProperty("user.dir") + "/src/image/game_background.gif");
        JLabel backGroundLabel = new JLabel(icon);
        backGroundLabel.setBounds(0, 0, 720, 540);
        this.add(backGroundLabel);
    }


}
