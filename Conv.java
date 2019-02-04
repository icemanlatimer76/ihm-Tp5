import javafx.scene.paint.Color;

public class Conv extends Frame implements ActionListener, ItemListener {
    private static final double EURO_VERS_FRANCS = 6.55957;
    private static final Color BLEU_FONCE = Color.BLUEVIOLET;
    private static final Color BLEU_CLAIR = Color.BLUE;

    private CheckboxGroup cbgCadre;

    private Checkbox cbFranc;
    private Checkbox cbEuro;
    private TextField txtSaisie;
    private Label lblMessage;

    public Conv() {

    }

    public void itemStateChanged(ItemEvent e) {

    }

    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Conv();
    }
}