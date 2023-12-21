class Empleado {
    private String nombre;
    private double salariobase;

    public Empleado(String nombre, double salariobase) {
        this.nombre = nombre;
        this.salariobase = salariobase;
    }
    public double calcularSalario() {
        return salariobase;
    }
    public String getNombre() {
        return nombre;
    }
}
class Gerente extends Empleado {
    private double bono;
    public Gerente(String nombre, double salariobase, double bono) {
        super(nombre, salariobase);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bono;
    }
}
class Desarrollador extends Empleado {
    private int horasExtras;

    public Desarrollador(String nombre, double salariobase, int horasExtras) {
        super(nombre, salariobase);
        this.horasExtras = horasExtras;
    }
    @Override
    public double calcularSalario() {
        // Supongamos que se paga el triple por las horas extras
        return super.calcularSalario() + (horasExtras * 3);
    }
}
public class Main {
    public static void main(String[] args) {
        // Crear instancias
        Empleado empleado = new Empleado("Lenin", 1200);
        Gerente gerente = new Gerente("Gerardo", 950, 250);
        Desarrollador desarrollador = new Desarrollador("Carlos", 1500, 12);

        // Mostrar salarios
        System.out.println("Salario de " + empleado.getNombre() + ": " + empleado.calcularSalario());
        System.out.println("Salario de " + gerente.getNombre() + ": " + gerente.calcularSalario());
        System.out.println("Salario de " + desarrollador.getNombre() + ": " + desarrollador.calcularSalario());
    }
}
