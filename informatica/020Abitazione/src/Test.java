public class Test {
    public static void main(String[] args) {
        Abitazione abitazione = new Abitazione( 5,100, "via rossi", "Cuneo");
        Villa villa = new Villa(5,100, "via rossi", "Cuneo",1,20,true);
        Appartamento appartamento = new Appartamento(5,100, "via rossi", "Cuneo",1,true);
        System.out.println(abitazione.toString());
        System.out.println(villa.toString());
        System.out.println(appartamento.toString());
    }
}
