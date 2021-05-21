public class Grade {

    private double current;
    private double goal;
    private double finPercent;


    public Grade(double current, double goal, double finPercent){
        this.current = current;
        this.goal = goal;
        this.finPercent = finPercent;
    }

    public Grade(){

    }


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
