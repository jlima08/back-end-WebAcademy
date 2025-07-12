package orientacao_objeto;

public class quadrado extends quadrilatero {
    public double lado;

    public quadrado(){ //constructor  padrão


    }
    //constructor personalizado
    public quadrado(double lado){
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    @Override

    public double calcularArea(){
        return this.lado * this.lado;
        // return Math.pow(this.lado, 2);
    }
    
}
