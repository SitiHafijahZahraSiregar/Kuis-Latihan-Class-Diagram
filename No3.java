public class Lingkaran {
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double luas() {
        return Math.PI * this.radius * this.radius;
    }
    
    public double keliling() {
        return 2 * Math.PI * this.radius;
    }
}
