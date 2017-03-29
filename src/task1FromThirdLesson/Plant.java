package task1FromThirdLesson;

import javax.print.attribute.standard.PrinterLocation;
import java.util.ArrayList;

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

    public static void main(String[] args) {
        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(new Wood("hhj", 88));
        plants.add(new Grass("HH",889));
        plants.add(new Oak("dhj",767));
        plants.add(new Banana("hjh",778));

        for (Plant plant:plants) {
            plant.grow();
        }
    }
}
