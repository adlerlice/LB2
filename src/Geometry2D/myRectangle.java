package Geometry2D;

public class myRectangle implements myFigure {
    private Double a, b;

    public String figureName = "Прямоугольник";

    public myRectangle(Double... sides) {
        a = sides[0];
        b = sides[1];
    }

    @Override
    public Double calcArea() {
        return a * b;
    }

    @Override
    public void showInformation() {
        System.out.println(
                "\n" + figureName + "\nСтороны прямоугольника: " + a + '\n' + b + '\n' + "Площадь: " + this.calcArea());
    }

    @Override
    public String getName() {
        return figureName;
    }

    @Override
    public Double getA() {
        return a;
    }

    @Override
    public Double getB() {
        return b;
    }

    @Override
    public Double getR() {
        return null;
    }
}
