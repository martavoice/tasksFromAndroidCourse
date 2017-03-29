package task1FromThirdLesson;

import java.util.ArrayList;

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

    public static void main(String[] args) {
        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(new Wood("hkjk", 88));
        plants.add(new Grass("HH",889));
        plants.add(new Oak("dhj",767));
        plants.add(new Banana("ujhjh",778));

        for (Plant plant:plants) {
            plant.grow();
        }
    }

}
