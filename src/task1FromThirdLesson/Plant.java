package task1FromThirdLesson;

/**
 * Created by Марта on 13.03.2017.
 */
public abstract class Plant {
    private String name;
    private int heigth;
    public Plant(String name, int weigth){
        this.name = name;
        this.heigth = weigth;
    }
    public abstract void grow();


}
