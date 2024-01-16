package Ejercicios.Persona;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona implements Comparable<Persona>{
    //Atributos
    private final String LISTA = "TRWAGMYFPDXBNJZSQVHLCKE";
    private final int MAYORIAEDAD = 18;
    private String dni;
    private String nombre;
    private String apellidos;
    private char sexo; //H o M
    private LocalDate fechaNacimiento;
    private int edad; //En años
    private int altura; //En cm
    private double peso; // En kg
    private boolean casado; // Sí o no

    //Constructor/es
    public Persona (String dni){
        setDni(dni);
        this.nombre = "";
        this.apellidos = "";
        this.sexo = 0;
        this.fechaNacimiento = null;
        this.edad = 0;
        this.altura = 0;
        this.peso = 0.0;
        this.casado = false;
    }

    //Constructor por defecto
    public Persona(){
        System.out.println("Se crea una Persona");
        this.dni = "00000000Z";
        this.nombre = "";
        this.apellidos = "";
        this.fechaNacimiento = null;
    }

    //Métodos
    public String calcularLetraDni(){
        
        return LISTA.charAt(Integer.parseInt(dni.substring(0, 8)) % 23);
    }

    public String getDni() {
        return dni;
    }

    private void setDni(String dni) {
        //validación DNI
        //-> 8 números y una letra
        try {
            if(dni.length() == 9 && Character.isAlphabetic(dni.charAt(8))){
            for(int i = 0;i < 8;i++){
                if(!Character.isDigit(dni.charAt(i))){
                    throw new Exception(); 
                }
            }
            this.dni = dni;
        }
        else{
            throw new Exception(); 
        }
        } catch (Exception error1) {
            System.out.println("ERROR");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaNacimiento() {
        //DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd'-'MMM'-'yyyy");
        //System.out.println(formato.format(fechaNacimiento));
        //return formato.format(fechaNacimiento);
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        this.edad = Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public int getEdad() {
        return edad;
    }

    private void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    @Override
    public String toString() {
        return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo=" + sexo
                + ", fechaNacimiento=" + getFechaNacimiento() + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso
                + ", casado=" + casado + "]";
    }
    
    @Override
    public int compareTo(Persona otro){
        return (this.edad - otro.edad);
    }
}
