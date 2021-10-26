import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class ButtonLogic {

    public ArrayList<JButton> NyttSpel(ArrayList<JButton> button) {

        Collections.shuffle(button);
        return button;
    }

}

