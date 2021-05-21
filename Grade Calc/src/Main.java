
public class Main {

    public static void main(String[] args){

        Grade name = new Grade();

        name.setCurrent(.40);
        name.setGoal(.75);
        name.setFinPercent(.30);

        Calculate name1 = new Calculate(name);


        double finalG =  (name1.calcGrade() * 100);
        System.out.printf("hello " + "%.2f %n", finalG);
        
    }

}
