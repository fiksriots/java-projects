/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

/**
 *
 * @author rifai
 */
public class TA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PenitipanController penitipan = new PenitipanController();
        new GUI_penitipan(penitipan).setVisible(true);
    }
    
}
