import javax.swing.*;

/**
 * @author Christian Kovacs
 *WIP Not done yet
 * Main Class, main method runs UI and calculation
 */
public class Main {


    public static void main(String[] args){

        //UI SetUp
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);


        //Creates the label for current grade
        JLabel currentLabel = new JLabel("Current Grade: ");
        currentLabel.setBounds(10,20, 130, 25);
        panel.add(currentLabel);

        //Creates the textbox for the current grade
        JTextField currentText = new JTextField();
        currentText.setBounds(130,20,165,25);
        panel.add(currentText);


        //Creates Goal Label
        JLabel goalLabel = new JLabel(("Grade Goal: "));
        goalLabel.setBounds(10,90, 150, 25);
        panel.add(goalLabel);

        //Creates Goal TextBox
        JTextField goalText = new JTextField();
        goalText.setBounds(130,90,165,25);
        panel.add(goalText);


        //Creates Final Weight Label
        JLabel finalLabel = new JLabel(("Final Exam Weight: "));
        finalLabel.setBounds(10,160, 150, 25);
        panel.add(finalLabel);

        //Creates Final Weight Textbox
        JTextField finalText = new JTextField();
        finalText.setBounds(130,160,165,25);
        panel.add(finalText);

        frame.setVisible(true);





        Grade name = new Grade();

        //number input here
        //TODO add UI to this

        name.setCurrent(50);
        name.setGoal(60);
        name.setFinPercent(25);

        Calculate name1 = new Calculate(name);


        double finalG =  (name1.calcGrade() * 100);
        System.out.printf("%.2f %n", finalG);
        
    }

}
