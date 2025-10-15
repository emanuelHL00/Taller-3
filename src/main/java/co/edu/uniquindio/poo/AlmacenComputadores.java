package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class AlmacenComputadores {
    private static AlmacenComputadores instancia;
    private List<Computador> listComputadores = new ArrayList<>();

    private AlmacenComputadores() {}

    public static AlmacenComputadores getInstancia() {
        if (instancia == null) {
            instancia = new AlmacenComputadores();
        }
        return instancia;
    }

    public void agregarComputadores(Computador pc) {
        listComputadores.add(pc);
    }

    public void mostrarInventario() {
        System.out.println("=== Inventario del Almacén ===");

        if (listComputadores.isEmpty()) {
            System.out.println("No hay computadoras registradas.");
        } else {
            for (Computador c : listComputadores) {
                System.out.println(c);
            }
        }
    }
}



