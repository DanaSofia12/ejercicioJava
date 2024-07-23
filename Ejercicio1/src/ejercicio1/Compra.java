/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author dana
 */
public class Compra {
    private String nombreCliente;
    private int tipoCliente;
    private int cantidadHojas;
    private int precioUnidad= 10000;


    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(int tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getCantidadHojas() {
        return cantidadHojas;
    }

    public void setCantidadHojas(int cantidadHojas) {
        this.cantidadHojas = cantidadHojas;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(int precioUnidad) {
        this.precioUnidad = precioUnidad;
    }
    
    public void calcularCompra(){
        
        int subtotal= cantidadHojas*precioUnidad;
        int neto;
        
        switch(tipoCliente){
            case 1 -> {
                System.out.println("Nombre del cliente: " +nombreCliente);
                System.out.println("Tipo de cliente: " + tipoCliente);
                System.out.println("Cantidad de hojas compradas: " +cantidadHojas);
                System.out.println("El SUBTOTAL de su compra es: "+ subtotal);
                neto= (int)(subtotal-(subtotal*0.05));
                System.out.println("Tiene un descuento del 5%!!");
                System.out.println("El TOTAL de su compra es: " + neto);
            }
            case 2 -> {
                System.out.println("Nombre del cliente: " +nombreCliente);
                System.out.println("Tipo de cliente: " + tipoCliente);
                System.out.println("Cantidad de hojas compradas: " +cantidadHojas);
                System.out.println("El SUBTOTAL de su compra es: "+ subtotal);
                neto= (int)(subtotal-(subtotal*0.08));
                System.out.println("Tiene un descuento del 8%!!");
                System.out.println("El TOTAL de su compra es: " + neto);
            }
            case 3 -> {
                System.out.println("Nombre del cliente: " +nombreCliente);
                System.out.println("Tipo de cliente: " + tipoCliente);
                System.out.println("Cantidad de hojas compradas: " +cantidadHojas);
                System.out.println("El SUBTOTAL de su compra es: "+ subtotal);
                neto= (int)(subtotal-(subtotal*0.12));
                System.out.println("Tiene un descuento del 12%!!");
                System.out.println("El TOTAL de su compra es: " + neto);
            }
            case 4 -> {
                System.out.println("Nombre del cliente: " +nombreCliente);
                System.out.println("Tipo de cliente: " + tipoCliente);
                System.out.println("Cantidad de hojas compradas: " +cantidadHojas);
                System.out.println("El SUBTOTAL de su compra es: "+ subtotal);
                neto= (int)(subtotal-(subtotal*0.15));
                System.out.println("Tiene un descuento del 15%!!");
                System.out.println("El TOTAL de su compra es: " + neto);
            }
            default -> {
                System.out.println("Nombre del cliente: " +nombreCliente);
                System.out.println("Tipo de cliente: " + tipoCliente);
                System.out.println("Cantidad de hojas compradas: " +cantidadHojas);
                System.out.println("El SUBTOTAL de su compra es: "+ subtotal);
                System.out.println("No tiene ningun descuento disponible!!");
                System.out.println("El TOTAL de su compra es: " + subtotal);
            }
        }
        }
    
    }


