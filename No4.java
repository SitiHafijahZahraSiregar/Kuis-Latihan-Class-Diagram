public class Titik {
    private int x; 
    private int y;

    public Titik(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public double distance(Titik o){
        double a = Math.pow((o.getX() - this.x), 2); 
        double b = Math.pow((o.getY() - this.y), 2); 
        return Math.sqrt(a+b); 
    }
}

public class Lingkaran {
    private double radius;
    private Titik titikPusat; 

    public Lingkaran(double radius, Titik titikPusat) {
        this.radius = radius;
        this.titikPusat = titikPusat;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Titik getTitikPusat() {
        return titikPusat;
    }

    public void setTitikPusat(Titik titikPusat) {
        this.titikPusat = titikPusat;
    }
    
    public double luas(){
        return Math.PI*(this.radius*this.radius);
    }
    
    public double keliling(){
        return  2*Math.PI*this.radius;
    }
}
