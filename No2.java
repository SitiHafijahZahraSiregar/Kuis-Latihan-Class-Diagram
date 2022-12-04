public class Titik {
    private int x,y;
    public Titik(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    double distance(Titik o){
     double r = ((o.x-this.x)*(o.x-this.x)) + ((o.y-this.y) *(o.y-this.y));
     double hasil = Math.sqrt(r);
     return hasil;
    }
}
