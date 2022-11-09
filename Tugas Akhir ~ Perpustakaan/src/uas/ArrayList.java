/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Rayhan_07023
 */
public class ArrayList {
    public java.util.ArrayList<Admin> admin = new java.util.ArrayList<>();
    public static String[] email = new String[10];
    public static String[] pass = new String[10];
    public static int index = 0;

    public void addMember(JTextField email, JPasswordField password) {
        String getEmail = email.getText();
        String getPass = password.getText();
        this.email[index] = getEmail;
        this.pass[index] = getPass;
        index++;
    }
    
}
