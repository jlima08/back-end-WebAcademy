package orientacao_objeto;

public class retangulo extends quadrilatero {
    private double base;
    private double altura;

    public retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea(){
        return this.base * this.altura;
    }

    
    
}
