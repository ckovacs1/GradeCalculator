import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Formatter;

/**
 * @author Christian Kovacs
 * WIP Not finished
 *
 */
public class Main implements ActionListener {

    private static JPanel panel;
    private static JFrame frame;
    private static JLabel currentLabel;
    private static JTextField currentText;
    private static JLabel goalLabel;
    private static JTextField goalText;
    private static JLabel finalLabel;
    private static JTextField finalText;
    private static JButton button;
    private static JLabel output;

    //https://www.youtube.com/watch?v=iE8tZ0hn2Ws
    public static void main(String[] args){

        //UI SetUp
        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);


        //Creates the label for current grade
        currentLabel = new JLabel("Current Grade: ");
        currentLabel.setBounds(10,20, 130, 25);
        panel.add(currentLabel);

        //Creates the textbox for the current grade
        currentText = new JTextField();
        currentText.setBounds(130,20,165,25);
        panel.add(currentText);


        //Creates Goal Label
        goalLabel = new JLabel(("Grade Goal: "));
        goalLabel.setBounds(10,90, 150, 25);
        panel.add(goalLabel);

        //Creates Goal TextBox
        goalText = new JTextField();
        goalText.setBounds(130,90,165,25);
        panel.add(goalText);


        //Creates Final Weight Label
        finalLabel = new JLabel(("Final Exam Weight: "));
        finalLabel.setBounds(10,160, 150, 25);
        panel.add(finalLabel);

        //Creates Final Weight Textbox
        finalText = new JTextField();
        finalText.setBounds(130,160,165,25);
        panel.add(finalText);


        //Creates and Adds the Enter Button
        button = new JButton("Enter");
        button.setBounds(215,220,79,25);
        panel.add(button);

        button.addActionListener(new Main());

        frame.setVisible(true);


        output = new JLabel((""));
        output.setBounds(10,230, 150, 25);
        panel.add(output);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //creates a new grade object
        Grade name = new Grade();

        //gets the inputs from the text boxes in the UI
        String current = currentText.getText();
        String goal    = goalText.getText();
        String finPerc = finalText.getText();

        //Sets them to doubles
        double curD = Double.parseDouble(current);
        double goaD = Double.parseDouble(goal);
        double finD = Double.parseDouble(finPerc);

        //sets the inputs to the grade object
        name.setCurrent(curD);
        name.setGoal(goaD);
        name.setFinPercent(finD);

        //creates calculation
        Calculate name1 = new Calculate(name);

        //calculates final grade
        double finalG =  (name1.calcGrade() * 100);

        //formats answer to 2 decimal places
        Formatter formatter = new Formatter();
        formatter.format("%.2f", finalG);


        String finalOut = String.valueOf(formatter);

        output.setText("You need: " + finalOut + "%");

    }

}
