package ejercicios;


class Planeta {
    private String nombre;
    private double periodoOrbital; // En años
    private double periodoRotacion; // En días


    public Planeta(String nombre, double periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }


    public void imprimir() {
        System.out.println("Nombre del planeta: " + nombre);
        System.out.println("Período orbital: " + periodoOrbital + " años");
        System.out.println("Período de rotación: " + periodoRotacion + " días");
    }


    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra", 1, 0.997);
        tierra.imprimir();

        System.out.println();

        Planeta marte = new Planeta("Marte", 1.88, 1.025);
        marte.imprimir();
    }
}

