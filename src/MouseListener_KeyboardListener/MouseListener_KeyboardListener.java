/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MouseListener_KeyboardListener;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author MohamadEsa 
 * Sumber : 
 * https://catscompsci.files.wordpress.com/2012/01/prac-ex-12-mouse-events-2009.doc
 * https://catscompsci.files.wordpress.com/2012/01/prac-ex-13-keyboard-events-2009.doc
 * 
 */
public class MouseListener_KeyboardListener extends Applet implements MouseListener, KeyListener, ActionListener{

    int x,y;
    String evt;
    
    Label purposes;
    char keyChar =' ';
    int number = 0;
    String s1="",s2="", s3="", s4="";
    Button start;
    
    @Override
    public void init() {
        addMouseListener(this);
        requestFocus();
        start = new Button("MULAI");
        add(start);
        start.addActionListener(this);
        addKeyListener(this);
        purposes = new Label("Bertujuan Untuk Menggunakan Kendali Mouse dan Keyboard pada Program");
        add(purposes);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        evt = "Mengklik";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        evt = "Menekan";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        evt = "Merilis";
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        showStatus("Tetikus Berada di dalam area Applet");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        showStatus("Tetikus berada di luar area Applet");
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Mouse "+evt+" di ("+x+","+y+")", x, y);       
        g.drawString("Number of keys pressed is : " + number, 20, 60);
        g.drawString("Character pressed is : " + keyChar, 20,80);
        g.drawString("Key pressed is : " + s1, 20, 100);
	g.drawString("Key released is : " + s4, 20, 120);
	g.drawString("Action key pressed is : " + s2, 20, 140);
        g.drawString(s3, 20, 160);
    }

    @Override
    public void keyTyped(KeyEvent ke) {
       keyChar = ke.getKeyChar();

        if(keyChar == 'x')

	s3 = "The key lower case x was pressed";

	repaint();
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        number++;
        s1 = ke.getKeyText(ke.getKeyCode());
        
        if(ke.getKeyCode() == ke.VK_UP) s2 = "Tanda Panah Atas";
        if(ke.getKeyCode() == ke.VK_ENTER) s2 = "Tanda Enter";
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        s4 = ke.getKeyText(ke.getKeyCode());
        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        requestFocus();
    }
    
    
    
}
