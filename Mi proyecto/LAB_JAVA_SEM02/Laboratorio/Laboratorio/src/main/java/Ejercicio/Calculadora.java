
package Ejercicio;

public class Calculadora {
    private double numero1, numero2;

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    
    public double Suma(){
        return numero1 + numero2;
    }
    
    public double Resta(){
        return numero1 - numero2;
    }
    
    public double Multiplicacion(){
        return numero1 * numero2;
    }
    
    public double Division(){
        return numero1 / numero2;
    }
    
    public String MostrarInformacion(){
        return "Suma: " + Suma() +
                "\nResta: " + Resta() +
                "\nMultiplicacion: "+ Multiplicacion()+
                "\nDivision: " + Division();         
    }
}
