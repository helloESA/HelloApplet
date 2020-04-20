/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagingPicture;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

/**
 *
 * @author MohamadEsa
 * Sumber : https://www.youtube.com/watch?v=w10EcS7wdQw
 */
public class ManagingPicture extends Applet {

    Image img;
    
    public void init() {
        img = getImage(getDocumentBase(), "download (2).png");   
    }
    
    @Override
    public void paint(Graphics grphcs) {
        grphcs.drawImage(img, 30, 30, this);
        grphcs.drawString("Logo Java", 30, 30);
        grphcs.drawString("Lokasi File Berada di : "+getCodeBase(), 30, 350);
    }
}
