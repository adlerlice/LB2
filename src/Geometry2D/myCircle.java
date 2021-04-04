package Geometry2D;

public class myCircle implements myFigure {
    private Double r;
    public String figureName = "Круг";

    public myCircle(Double radius) {
        r = radius;
    }

    @Override
    public Double calcArea() {
        return Math.PI * r * r;
    }

    @Override
    public void showInformation() {
        System.out.println("\n" + figureName + "\nИнформация по шару: " + r + "\n" + "Площадь: " + this.calcArea());
    }
    @Override
    public String getName() {
        return figureName;
    }

    @Override
    public Double getA() {
        return null;
    }

    @Override
    public Double getB() {
        return null;
    }

    @Override
    public Double getR() {
        return r;
    }
}

