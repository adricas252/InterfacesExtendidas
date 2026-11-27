public class InterfacesExtendidas {
    public static void main(String[] args) {

        Cancion cancion = new Cancion("Along The Stars");

        Reproducible comoReproducible = cancion;
        Grabable comoGrabable = cancion;
        Multimedia comoMultimedia = cancion;

        comoReproducible.reproducir();

        comoGrabable.grabar();

        comoMultimedia.reproducir();
        comoMultimedia.grabar();
    }
}
