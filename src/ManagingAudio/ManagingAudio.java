/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagingAudio;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author MohamadEsa
 * Sumber :
 * https://catscompsci.files.wordpress.com/2012/01/prac-ex-8b-sounds-20091.doc
 */
public class ManagingAudio extends Applet implements ActionListener{

    AudioClip sound;
    Button play, loop, stop;
    int action;
    public void init() {
       sound = getAudioClip(getDocumentBase(), "Sink 01.wav");
       
       play = new Button("Play");
        add(play);
        play.addActionListener(this);
        
        loop = new Button("Ulang");
        add(loop);
        loop.addActionListener(this);
        
        stop = new Button("Berhenti");
        add(stop);
        stop.addActionListener(this);
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void paint(Graphics grphcs) {
       grphcs.drawString("Program Mengelola Suara", 20, 100);
       switch(action){
           case 1 : grphcs.drawString("Suara Sedang Dimainkan", 20, 120); break;
           case 2 : grphcs.drawString("Suara Diulang", 20, 120); break;
           case 3 : grphcs.drawString("Suara Berhenti", 20, 120); break;
       }
    }

    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == play){
            sound.play();
            action = 1;
        } else if (ae.getSource() == loop){
            sound.loop();
            action = 2;
        } else if (ae.getSource() == stop){
            sound.stop();
            action = 3;
        }
        repaint();
    }
}
