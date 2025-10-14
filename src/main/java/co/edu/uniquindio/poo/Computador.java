package co.edu.uniquindio.poo;

public class Computador {
    private String ram, cpu, discoDuro, gpu;

    private Computador(String ram, String cpu, String discoDuro, String gpu){
        this.ram = ram;
        this.cpu = cpu;
        this.discoDuro = discoDuro;
        this.gpu = gpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
}
