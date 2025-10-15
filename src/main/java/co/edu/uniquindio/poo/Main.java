package co.edu.uniquindio.poo;


public class Main {
    public static void main(String[] args) {
        ComputadorFacade facade = new ComputadorFacade();

        Computador pc = facade.construirComputador();

        System.out.println("PC final creada: " + pc);
        AlmacenComputadores.getInstancia().mostrarInventario();
    }
}