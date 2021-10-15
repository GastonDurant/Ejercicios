
package main;


public class Gato {
    
    private String nombre;
    private int edad;
    private String apodo;
    private String Alimento;

    public Gato() {
    }

    public Gato(String nombre, int edad, String apodo, String Alimento) {
        this.nombre = nombre;
        this.edad = edad;
        this.apodo = apodo;
        this.Alimento = Alimento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getAlimento() {
        return Alimento;
    }

    public void setAlimento(String Alimento) {
        this.Alimento = Alimento;
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", edad=" + edad + ", apodo=" + apodo + ", Alimento=" + Alimento + '}';
    }
    
    
    
}
