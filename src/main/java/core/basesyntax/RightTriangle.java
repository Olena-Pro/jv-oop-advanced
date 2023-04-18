package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;
    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }
    @Override
    public void getDraw() {
        System.out.println("Figure: triangle, area: " + getArea() + " sq.units, firstLeg :" + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + getColor());
    }
    @Override
    public double getArea() {
        return firstLeg * secondLeg/2;
    }
}

