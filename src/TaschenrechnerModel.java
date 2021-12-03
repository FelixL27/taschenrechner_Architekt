public class TaschenrechnerModel {
    private int ersterOperand;
    private int zweiterOperand;
    private String operator;

    public int getErgebnis(){
        if(operator.equals("+")){
            return ersterOperand + zweiterOperand;
        }
        else if(operator.equals("-")){
            return ersterOperand - zweiterOperand;
        }
        else {
            return zweiterOperand;
        }
    }

    public void zurücksetzen() {
        operator = null;
    }

    public void setErsterOperand(int ersterOperand) {
        this.ersterOperand = ersterOperand;
    }

    public void setZweiterOperand(int zweiterOperand) {
        this.zweiterOperand = zweiterOperand;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
