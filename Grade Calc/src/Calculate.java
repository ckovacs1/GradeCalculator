public class Calculate {

    private Grade grade;

    public Calculate(Grade grade){
        this.grade = grade;
    }


    public double calcGrade(){

        double gradeReq = (grade.getGoal() -( ( 1 - grade.getFinPercent()) * grade.getCurrent())) / grade.getFinPercent();
        return gradeReq;
    }

}
