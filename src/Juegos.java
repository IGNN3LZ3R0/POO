public class Juegos {
    //declaro atributos que tendran los objetos
    public String nombre;
    public int aniosalida;
    public String categoria;
    public String newold;
    //aqui es donde declaro los atributos para que se puedan asignar
    public Juegos(String nombre, int aniosalida, String categoria,
                  String newold) {
        this.nombre = nombre;
        this.aniosalida = aniosalida;
        this.categoria = categoria;
        this.newold = newold;
    }
    //en estas lineas es donde declaro los objetos que voy a usar
    public static void Juegos(String[]args){
        Juegos juego1=new Juegos("Demons Crest", 1997,"RPG","retro");
        Juegos juego2=new Juegos("The last of us",
                2015,"Survival","Nueva generacion");
        Juegos juego3=new Juegos("Mortal Kombat", 2023,"Pelea","Nueva generacion");
    }
    //aqui usa una funcion de imprimir los resultados como los quieroque se presente cuando se ejecute
    public void imprimir(){
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*- *-*-*");
        System.out.println("El titulo se llama "+nombre);
        System.out.println("Salio en el año "+aniosalida);
        System.out.println("Pertenece al genero: "+categoria);
        System.out.println("Por lo tanto es: "+newold);
    }
    //aqui es donde llamo al main y a todas las finciones pra que se pueda ejecutar
    public static void main(String[] args) {
        Juegos juego1=new Juegos("Demons Crest", 1997,"RPG","retro");
        Juegos juego2=new Juegos("The last of us",
                2015,"Survival","Nueva generacion");
        Juegos juego3=new Juegos("Mortal Kombat", 2023,"Pelea","Nueva generacion");
        juego1.imprimir();
        juego2.imprimir();
        juego3.imprimir();
    }
}
