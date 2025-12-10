public class Envio {
    String numero;
    Float precio;

    // Constructor: sirve para inicializar los atributos del objeto
    public Envio(String numero, Float precio){
        // this es el objeto que ejecuta el código
        this.numero = numero;
        this.precio = precio;
        System.out.println("Construyendo objeto Envio...");
    }

    public String verComoString(){
        String texto = this.numero + "\t\t" + this.precio + "€";
        return texto;
    }
}