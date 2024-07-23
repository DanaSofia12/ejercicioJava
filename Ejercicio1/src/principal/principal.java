/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import ejercicio1.Compra;
import java.util.Scanner;

/**
 *
 * @author dana
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Compra c = new Compra();
        System.out.println("BIENVENIDOS A LA EMPRESA DE HIELO SECO:)");
        System.out.println("A continuacion escribe tu nombre: ");
        c.setNombreCliente(teclado.nextLine());
        System.out.println("Ahora escribe el numero de tipo de cliente que eres ");
        c.setTipoCliente(Integer.parseInt(teclado.nextLine()));
        System.out.println("Por ultimo, digita el numero de hojas que compraste: ");
        c.setCantidadHojas(Integer.parseInt(teclado.nextLine()));
        System.out.println("La factura de su compra es: ");
        c.calcularCompra();

    }
    
}
