/**
 * @author Christian Kovacs
 * This class stores the grade class which holds the current grade, goal for the course and
 * what percentage the final grade is worth
 */

public class Grade {

    private double current;
    private double goal;
    private double finPercent;

    /**
     * Creates an instance of teh grade object
     * @param current current grade in the class
     * @param goal goal grade
     * @param finPercent what percent the final exam is worth
     */
    public Grade(double current, double goal, double finPercent){
       this.current    = current;
       this.goal       = goal;
       this.finPercent = finPercent;


    }

    public Grade(){

    }


    /**
     * Setters and Getters for all the instance variables
     */
    public double getCurrent(){
        return current;
    }

    public double getGoal() {
        return goal;
    }

    public double getFinPercent() {
        return finPercent;
    }

    public void setCurrent(double current) {
        this.current = current;
    }

    public void setGoal(double goal) {
        this.goal = goal;
    }

    public void setFinPercent(double finPercent) {
        this.finPercent = finPercent;
    }




}
