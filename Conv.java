import java.awt.*;
import java.awt.event.*;

public class Conv extends Frame implements ActionListener, ItemListener {
  private static final double EURO_VERS_FRANCS = 6.55957;
  private static final Color BLEU_FONCE = new Color(111, 130, 191);
  private static final Color BLEU_CLAIR = new Color(130, 160, 250);

  private CheckboxGroup cbgCadre;

  private Checkbox cbFranc;
  private Checkbox cbEuro;
  private TextField txtSaisie;
  private Label lblMessage1;
  private Label lblMessage2;

  public Conv() {

    setTitle("Convertiseur");
    setLocation(300, 300);
    setSize(1400, 1400);

    setLayout(new GridLayout(7, 1)); // 2

    setBackground(BLEU_FONCE);
    cbgCadre = new CheckboxGroup();

    cbEuro = new Checkbox("Euro", cbgCadre, false);
    cbFranc = new Checkbox("Franc", cbgCadre, false);

    cbEuro.addItemListener(this);
    cbFranc.addItemListener(this);

    add(new Label("Quelle monnaie voulez-vous convertir ?"));
    add(cbFranc);
    add(cbEuro);
    lblMessage1 = new Label("");
    add(lblMessage1);

    add(new Label("Montant à convertir"));
    txtSaisie = new TextField();
    txtSaisie.addActionListener(this);
    add(txtSaisie);

    lblMessage2 = new Label("");
    Font f = new Font("name", 10, 30);
    lblMessage2.setFont(f);
    add(lblMessage2);

    pack();
    setVisible(true);
  }

  public void itemStateChanged(ItemEvent e) {
    if (cbEuro.getLabel() == e.getItem()) {
      cbEuro.setBackground(BLEU_CLAIR);
      cbFranc.setBackground(BLEU_FONCE);
      lblMessage1.setText("Euro -->  Franc");
    }

    if (cbFranc.getLabel() == e.getItem()) {
      cbFranc.setBackground(BLEU_CLAIR);
      cbEuro.setBackground(BLEU_FONCE);
      lblMessage1.setText("Franc -->  Euro");
    }

  }

  public void actionPerformed(ActionEvent e) {

    double num;
    int round;

    num = Double.parseDouble(txtSaisie.getText());

    if (cbgCadre.getCurrent().equals(cbFranc)) {
      num = num / EURO_VERS_FRANCS;
      round = (int) (num * 100);
      num = round / 100.00;
      lblMessage2.setText(num + " Euros");
    }
    if (cbgCadre.getCurrent().equals(cbEuro)) {
      num = num * EURO_VERS_FRANCS;
      round = (int) (num * 100);
      num = round / 100.00;
      lblMessage2.setText(num + " Franc");
    }

  }

  public static void main(String[] args) {
    new Conv();
  }
}