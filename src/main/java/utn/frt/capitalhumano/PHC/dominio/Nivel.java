/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.frt.capitalhumano.PHC.dominio;

/**
 *
 * @author josdan
 */
public class Nivel {
    private int idNivel = 0;
    private String nombre;

    public Nivel(String nombre) {
        this.nombre = nombre;
    }

    public int getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(int idNivel) {
        this.idNivel = idNivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nivel{" + "idNivel=" + idNivel + ", nombre=" + nombre + '}';
    }
}
