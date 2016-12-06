/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.distribucionDeFrecuencias.entidades;


import java.util.Collections;
import java.util.List;

/**
 * Entidad que posee los metodos para las soluciones del algorito que resuelve la distrubucion de frecuencias
 * @author SaulUrias
 */
public class Solucion {

/**
 * Metodo utilizado para obtener el numero de elemntos dentro de la lista
 * @param lista
 * @return 
 */
    public int numeroDeDatos(List lista) {
        return lista.size();
    }

    /**
     * Metodo utilizado para obtener el valor maximo de una lista
     * @param lista
     * @return 
     */
    public int valorMaximo(List<Integer> lista) {
        Collections.sort(lista);
        int valorMaximo = lista.get(lista.size() - 1);
        return valorMaximo;
    }

    /**
     * Metodo utilizado para obtener el valor minimo dentro de una lista
     * @param lista
     * @return 
     */
    public int valorMinimo(List<Integer> lista) {
        Collections.sort(lista);
        int valorMinimo = lista.get(0);
        return 1;
    }

    /**
     * Metodo utilizado para obtener el rango entre el valor maximo y el valor minimo
     * @param valorMaximo
     * @param valorMinimo
     * @return 
     */
    public int rango(int valorMaximo, int valorMinimo) {
        return valorMaximo - valorMinimo;
    }

    /**
     * Metodo utilizado para obtener el intervalo de datos
     * @param numeroDeDatos
     * @return 
     */
    public int intervalos(int numeroDeDatos) {
        int intervalos = (int) (1 + (3.3 * Math.log10(numeroDeDatos)));
        return intervalos;
    }

    /**
     * Metodo utilizado para obtener la amplitud de clase
     * @param rango
     * @param intervalos
     * @return 
     */
    public int amplitudDeClase(int rango, int intervalos) {
        int amplitud = (int) (rango / intervalos);
        return amplitud;
    }

    /**
     * Metodo utilizado para obtener la Media de una lista
     * @param lista
     * @return 
     */
    public double media(List lista) {
        double media = 0;
        for (int i = 0; i < lista.size(); i++) {
            media = (int) lista.get(i) + media;
        }
        media = media / lista.size();

        return media;
    }

    /**
     * Metodo utilizado para obtener la mediana de una lista
     * @param lista
     * @return 
     */
    public double mediana(List lista) {
        double mediana = 0;
        int posMed = 0;
        Collections.sort(lista);


        for (int i = 0; i < lista.size(); i++) {
            posMed++;

        }
        if (posMed % 2 == 0) {

            int lugar1 = posMed / 2;
            int lugar2 = lugar1 - 1;
            double a = (int) lista.get(lugar1);
            double b = (int) lista.get(lugar2);

            mediana = (a + b) / 2;
            return mediana;

        } else {
            int lugar = (posMed / 2);
            double resp = (int) lista.get(lugar);
            mediana = resp;
            return mediana;
        }

    }
}
