public class Floor {

    private double width;
    private double height;

    public Floor(double width, double height) {
        this.width= Math.max(width, 0);
        this.height = Math.max(height, 0);
    }
    public double getArea() {
        return width * height;
    }
}
