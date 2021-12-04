public class TaschenrechnerMain1 {
    public static void main(String[] args) {
        TaschenrechnerModel1 model = new
                TaschenrechnerModel1();

        model.setErsterOperand(29);
        model.setZweiterOperand(18);
        model.setOperator("+");
        System.out.println(model.getErgebnis());

        model.setOperator("-");
        System.out.println(model.getErgebnis());
        model.zurücksetzen();
        System.out.println(model.getErgebnis());
    }
}
