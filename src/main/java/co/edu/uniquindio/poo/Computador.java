package co.edu.uniquindio.poo;

public class Computador {
    private String ram, cpu, discoDuro, gpu;

    private Computador(Builder builder) {
        this.ram = builder.ram;
        this.cpu = builder.cpu;
        this.discoDuro = builder.discoDuro;
        this.gpu = builder.gpu;
    }

    public static class Builder{
        private String ram, cpu, discoDuro, gpu;

        public Builder ram(String ram){
            this.ram = ram;
            return this;
        }

        public Builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }

        public Builder discoDuro(String discoDuro){
            this.discoDuro = discoDuro;
            return this;
        }

        public Builder gpu(String gpu){
            this.gpu = gpu;
            return this;
        }

        public Computador build(){
            return new Computador(this);
        }

    }

    @Override
    public String toString() {
        return "Computador{" +
                "ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                ", discoDuro='" + discoDuro + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }
}
