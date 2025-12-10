public class Furgoneta {
    public Boolean realizar (Envio envio, String direccion){
        System.out.println("Realizando envío a " + direccion);
        return Math.random() > 0.5;
    }
}