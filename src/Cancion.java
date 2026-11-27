public class Cancion implements Multimedia {
    private final String titulo;

    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo cancion: " + this.titulo);
    }

    @Override
    public void grabar() {
        System.out.println("Grabando cancion: " + this.titulo);
    }
}
