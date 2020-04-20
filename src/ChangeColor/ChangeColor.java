/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChangeColor;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author MohamadEsa
 * Sumber :
 * https://www.youtube.com/watch?v=NK4hc_uPEO4&pbjreload=10
 */
public class ChangeColor extends Applet implements ActionListener{

    Button b1,b2,b3,b4,b5;
    AudioClip suara;
    Image img1, img2, img3, img4;
    
    public void init() {
        this.setLayout(null);
        suara = getAudioClip(getDocumentBase(), "Water_Impact_2.wav");
        img1 = getImage(getDocumentBase(), "img1.png");
        img2 = getImage(getDocumentBase(), "img2.png");
        img3 = getImage(getDocumentBase(), "img3.png");
        img4 = getImage(getDocumentBase(), "img4.png");
        
        b1 = new Button("BIRU");
        b2 = new Button("MERAH");
        b3 = new Button("HIJAU");
        b4 = new Button("HITAM");
        
        Font f = new Font("Arial", Font.BOLD, 16);
        
        b1.setBounds(50, 50, 100, 30);
        this.add(b1);
        b1.setFont(f);
        
        b2.setBounds(50, 150, 100, 30);
        this.add(b2);
        b2.setFont(f);
        
        b3.setBounds(200, 50, 100, 30);
        this.add(b3);
        b3.setFont(f);
        
        b4.setBounds(200, 150, 100, 30);
        this.add(b4);
        b4.setFont(f);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1){
            suara.play();
            this.setBackground(Color.blue);
            b5 = b1;
            repaint();
        } else if(ae.getSource() == b2){
            suara.play();
            this.setBackground(Color.red);
            b5 = b2;
            repaint();
        } else if(ae.getSource() == b3){
            suara.play();
            this.setBackground(Color.green);
            b5 = b3;
            repaint();
        } else if(ae.getSource() == b4){
            suara.play();
            this.setBackground(Color.black);
            b5 = b4;
            repaint();
        } 
    }

    @Override
    public void paint(Graphics g) {
        Font f = new Font("Arial", Font.BOLD, 16);
        g.setFont(f);
        
       
        
        if(b5 == b1){
//            g.drawString("Anda Memilih Warna "+getBackground(), 100, 100);
             g.drawImage(img1, 140, 90, this);
        } else if(b5 == b2){
//            g.drawString("Anda Memilih Warna "+getBackground(), 100, 100);
             g.drawImage(img2, 140, 90, this);
        } else if(b5 == b3){
//            g.drawString("Anda Memilih Warna "+getBackground(), 100, 100);
             g.drawImage(img3, 140, 90, this);
        } else if(b5 == b4){
//            g.setColor(Color.white);
//            g.drawString("Anda Memilih Warna "+getBackground(), 100, 100);
             g.drawImage(img4, 140, 90, this);
        }
    }
    
    
}
