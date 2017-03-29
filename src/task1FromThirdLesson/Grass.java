package task1FromThirdLesson;

/**
 * Created by Марта on 13.03.2017.
 */
public class Grass extends Plant {
    public Grass(String name, int heigth){
        super(name, heigth);
    }
    public void grow(){
        System.out.println("Grass is growing");
    }
    public void cut(int numberForCut){
        int heigth = 0;
        while (heigth-numberForCut>0){
            heigth -=numberForCut;
        }

    }
}
