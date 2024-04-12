public class Main {
    public static void main(String[] args) {
        Singleton unicaInstancia = Singleton.getInstance();
        unicaInstancia.setAlias("Fernando");
        System.out.println(unicaInstancia.getAlias());
        unicaInstancia.setRondaPartida(4);
        Singleton otraInstancia = Singleton.getInstance();
        otraInstancia.setRondaPartida(5);
        System.out.println(otraInstancia.getRondaPartida());
    }
}