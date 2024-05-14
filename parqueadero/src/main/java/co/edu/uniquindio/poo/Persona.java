package co.edu.uniquindio.poo;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;

public class Persona {
    private final String nombres;
    private final String apellidos;
    private final int edad;
    private final String celular;
    private final String correo;

    public Persona(String nombres, String apellidos, int edad, String celular, String correo) {
        ASSERTION.assertion(nombres != null && !nombres.isBlank(), "Error: el nombre no puede ser nulo ni vacío.");
        ASSERTION.assertion(apellidos != null && !apellidos.isBlank(), "Error: el apellido no puede ser nulo ni vacío.");
        ASSERTION.assertion(edad >= 18, "Error: debe ser mayor de edad.");
        ASSERTION.assertion(celular != null && !celular.isBlank(), "Error: el celular no puede ser nulo ni vacío");
        ASSERTION.assertion(correo != null && !correo.isBlank(), "Error: el correo no puede ser nulo ni vacío");

        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.celular = celular;
        this.correo = correo;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }

    
}
