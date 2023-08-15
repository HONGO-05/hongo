package front.quiz;

import front.quiz.components.QuizGamePanel;
import front.quiz.components.QuizResultPanel;
import front.quiz.components.QuizTitlePanel;
import front.screen_mode.QuizScreenMode;
import javax.swing.*;
import java.awt.*;


public class QuizPanel extends JPanel {
    QuizScreenMode quizScreenMode;
    QuizTitlePanel quizTitlePanel;
    QuizResultPanel quizResultPanel;
    QuizGamePanel quizGamePanel;
    CardLayout layout = new CardLayout();

    private static QuizPanel quizPanel = new QuizPanel();
    private QuizPanel(){
        this.setLayout(layout);
        quizTitlePanel = new QuizTitlePanel();
        this.add(quizTitlePanel, "クイズタイトル");

        quizGamePanel = new QuizGamePanel();
        this.add(quizGamePanel, "クイズゲーム");
    }

    public static QuizPanel getInstance(){
        return quizPanel;
    }

    public static QuizPanel getInstance(QuizScreenMode s){
        quizPanel.setFrontScreenAndFocus(s);
        return quizPanel;
    }


    public void prepareComponents(){
        quizTitlePanel.prepareComponents();
        quizGamePanel.prepareComponents();
    }

    public void setFrontScreenAndFocus(QuizScreenMode s){
        quizScreenMode = s;
        switch(quizScreenMode){
            case QUIZ_TITLE:
                layout.show(this, "クイズタイトル");
                quizTitlePanel.requestFocus();
                break;
//            case QUIZ_RESULT:
//                layout.show(quizResultPanel, "クイズリザルト");
//                quizResultPanel.requestFocus();
//                break;
            case QUIZ_GAME:
                layout.show(this, "クイズゲーム");
                quizGamePanel.requestFocus();
                break;
        }

    }
}
