package Geometry3D;
import Geometry2D.*;
public class myCilynder {
    myFigure F;
    Double h;
    public String figureName = "Цилиндр";
    public myCilynder(myFigure myFigure, Double height) {
        F = myFigure;
        h = height;
    }

    public Double volume() {
        return F.calcArea() * h;
    }

    public void showInformation() {
        System.out.println("\n" + F.getName() + "\nОбъем цилиндра с таким основанием:\n" + this.volume() + "\n");
    }
}
