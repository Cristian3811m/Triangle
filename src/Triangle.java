public class Triangle {
    private float base;
    private float heigth;
    private float area;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeigth() {
        return heigth;
    }

    public void setHeigth(float heigth) {
        this.heigth = heigth;
    }
    public float calcularArea(){
        area = base * heigth /2;
        return area;
    }
}
