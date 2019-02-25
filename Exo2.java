import java.awt.*;
import java.awt.event.*;

public class Exo2 extends Frame implements ItemListener // 1
{
    private CheckboxGroup cbgCadre;

    private Checkbox cbEntree;
    private Checkbox cbPlat;
    private Checkbox cbFromage;
    private Checkbox cbDessert;

    public Exo2() {
        setTitle("Cases à cocher");
        setLocation(50, 50);

        setLayout(new GridLayout(3, 2)); // 2
        cbgCadre = new CheckboxGroup(); // 4
        // Ajout de choix NON exclusif
        add(new Label("Choix Non exclusif"));
        add(new Label("Choix exclusif"));

        cbEntree = new Checkbox("Entrée");
        cbFromage = new Checkbox("Fromage", cbgCadre, false);
        cbPlat = new Checkbox("Plat");
        cbDessert = new Checkbox("Dessert", cbgCadre, false);

        cbEntree.addItemListener(this); // 3
        cbPlat.addItemListener(this);
        cbFromage.addItemListener(this);
        cbDessert.addItemListener(this);
        add(cbEntree);
        add(cbFromage);
        add(cbPlat);
        add(cbDessert);

        pack();
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) // 5
    {
        System.out.println("itemStateChanged");
    }

    public static void main(String[] arg) {
        new Exo2();
    }
}