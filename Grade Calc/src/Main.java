
public class Main {

    public static void main(String[] args){

        Grade name = new Grade();

        //number input here
        //TODO add UI to this
        name.setCurrent(1);
        name.setGoal(.75);
        name.setFinPercent(.30);

        Calculate name1 = new Calculate(name);


        double finalG =  (name1.calcGrade() * 100);
        System.out.printf("%.2f %n", finalG);
        
    }

}
