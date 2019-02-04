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
        this.setTitle("Cases à cocher");
        this.setLocation(50, 50);

        this.setLayout(new GridLayout(3, 2)); // 2
        this.cbgCadre = new CheckboxGroup(); // 4
        // Ajout de choix NON exclusif
        this.add(new Label("Choix Non exclusif"));
        this.add(new Label("Choix exclusif"));

        this.cbEntree = new Checkbox("Entrée");
        this.cbFromage = new Checkbox("Fromage", this.cbgCadre, false);
        this.cbPlat = new Checkbox("Plat");
        this.cbDessert = new Checkbox("Dessert", this.cbgCadre, false);

        this.cbEntree.addItemListener(this); // 3
        this.cbPlat.addItemListener(this);
        this.cbFromage.addItemListener(this);
        this.cbDessert.addItemListener(this);
        this.add(this.cbEntree);
        this.add(this.cbFromage);
        this.add(this.cbPlat);
        this.add(this.cbDessert);

        this.pack();
        this.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) // 5
    {
        System.out.println("itemStateChanged");
    }

    public static void main(String[] arg) {
        new Exo2();
    }
}