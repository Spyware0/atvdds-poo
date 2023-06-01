package lab08;

public class Ponto3D extends Ponto2D{
    private double z;

    public Ponto3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }
    
    public Ponto3D(){
        super();
        this.z = 0.0;
    }

    public double getZ() {
        return this.z;
    }

    public void desloca(double x, double y, double z) {
        super.desloca(x, y);
        this.z += z;
    }

    public Ponto3D somaPonto(double x, double y, double z){
        return new Ponto3D(super.getX() + x, super.getY() + y,
        this.z + z);
    }
}
