package task1FromThirdLesson;

/**
 * Created by Марта on 13.03.2017.
 */
public class Wood extends Plant{
    public Wood(String name, int heigth){
        super(name, heigth);
    }
    public void grow(){
        System.out.println("Wood is growing");
    }
    public void makeRoots(){}

}
