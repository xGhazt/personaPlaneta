package ejercicios;

class Persona {
    private String nombre;
    private int edad;
    private String paisNacimiento;
    private char genero;


    public Persona(String nombre, int edad, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }


    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("País de nacimiento: " + paisNacimiento);
        System.out.println("Género: " + (genero == 'H' ? "Hombre" : "Mujer"));
    }


    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan Perez", 30, "Argentina", 'H');
        persona1.imprimir();

        System.out.println();

        Persona persona2 = new Persona("Ana López", 25, "México", 'M');
        persona2.imprimir();
    }
}
