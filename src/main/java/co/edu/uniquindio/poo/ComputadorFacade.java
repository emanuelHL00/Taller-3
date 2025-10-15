package co.edu.uniquindio.poo;

public class ComputadorFacade {

    public Computador construirComputador() {
        System.out.println("Iniciando proceso de construcción de una PC");
        prepararComponentes();
        Computador pc = ensamblarComputadora();
        probarComputadora(pc);
        guardarEnAlmacen(pc);
        System.out.println("Ensamblaje completado exitosamente.\n");
        return pc;
    }

    private void prepararComponentes() {
        System.out.println("Preparando componentes: CPU, RAM, GPU, disco.");
    }

    private Computador ensamblarComputadora() {
        System.out.println("Ensamblando la computadora");
        return new Computador.Builder()
                .cpu("Intel i9")
                .ram("32 GB ")
                .discoDuro("1 TB SSD")
                .gpu("NVIDIA RTX 4080")
                .build();
    }

    private void probarComputadora(Computador pc) {
        System.out.println("Probando el rendimiento del sistema");
        System.out.println("Resultados: Todo funcionando correctamente.");
    }

    private void guardarEnAlmacen(Computador pc) {
        System.out.println("Guardando la computadora en el almacén.");
        AlmacenComputadores.getInstancia().agregarComputadores(pc);
    }


}
