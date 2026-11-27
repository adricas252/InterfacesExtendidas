public class Telefono implements Wifi, Bluetooth {
    private final String modelo;

    public Telefono(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void conectarWifi(){
        System.out.println("Teléfono " + modelo + ": conectando al wifi.");
    }

    @Override
    public void conectarBluetooth(){
        System.out.println("Telefono " + modelo + ": conectando al bluetooth.");
    }

    public static  void main(String[] args) {
        Telefono telefono = new Telefono("Oppo A9 2020");
        telefono.conectarBluetooth();
        telefono.conectarWifi();
    }
}
