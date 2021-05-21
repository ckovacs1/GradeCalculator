/**
 *@author Christian Kovacs
 *Uses the grade class to calculate the grade using the data from the grade
 */
public class Calculate {

    private Grade grade;

    /**
     * Constructs the calculation
     * @param grade
     */
    public Calculate(Grade grade){
        this.grade = grade;
    }

    /**
     * takes the data from the grade and calculates the percent needed on the final to reach the goal
     * @return
     */
    public double calcGrade(){

        /*The grade is calculated using numbers between 0 and 1 so any number greater than 1 will
        * be converted into a number between 0 and 1
        * */
        if (grade.getFinPercent() > 1){
            grade.setFinPercent(grade.getFinPercent() / 100);
        }
        if (grade.getCurrent() > 1){
            grade.setCurrent(grade.getCurrent() / 100);
        }
        if (grade.getGoal() > 1){
            grade.setGoal(grade.getGoal() / 100);
        }


        double gradeReq = (grade.getGoal() -( ( 1 - grade.getFinPercent()) * grade.getCurrent())) / grade.getFinPercent();
        return gradeReq;
    }

}
