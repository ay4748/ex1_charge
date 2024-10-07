//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Chargeable[] canCharge = new Chargeable[3];
        canCharge[0] = (new Phone());
        canCharge[1] = (new Tablet());
        canCharge[2] = (new Laptop());

        for(Chargeable c : canCharge)
        {
            c.charge();
        }
    }
}