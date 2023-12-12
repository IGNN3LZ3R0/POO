public class Operacionesmatematicas {
    public double suma;
    public void suma(int num1,int num2){
        System.out.println("La suma de los dos numeros es: "+(num1+num2));
    }
    public void suma(int num1,int num2,int num3){
        System.out.println("La suma de los tres numeros mas 5 es: "+(num1+num2+num3+5));
    }
    public void suma(double dec1,double dec2){
        System.out.println("La suma de los dos numeros decimales mas 2 es: "+(dec1+dec2+2));
    }
    public static void main(String[] args){
        Operacionesmatematicas Operacionesmatematicas1=new Operacionesmatematicas();
        System.out.println("Dos numeros");
        Operacionesmatematicas1.suma(10,10);
        System.out.println("Tres numeros mas 5");
        Operacionesmatematicas1.suma(10,10,10);
        System.out.println("Dos numeros decimales mas 2");
        Operacionesmatematicas1.suma(10.25, 10.25);
    }
}
