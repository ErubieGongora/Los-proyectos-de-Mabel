package cuboobjetos;

public class Cuadrado {

    //Se hacen los calculos del cuadrado
   public double a;

    public  Cuadrado(double lado) {
        this.a =  lado;
    }
    
    public  double calcularArea(){
        return this.a * this.a;
    }
    
    public  double calcularPerimetro()
    {
        return this.a *4;
    }
}