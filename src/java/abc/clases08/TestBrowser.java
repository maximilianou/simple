/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc.clases08;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maximilianou
 */
public class TestBrowser {

    public static void main(String[] args) {
        try {

            java.awt.Desktop.getDesktop().browse(new java.net.URI("http://www.maximilianou.com"));

        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
