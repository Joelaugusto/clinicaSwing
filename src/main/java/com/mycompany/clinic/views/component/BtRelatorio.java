/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clinic.views.component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 *
 * @author trido
 */
public class BtRelatorio extends  JButton implements ActionListener,MouseListener{

    public BtRelatorio() {
         setOpaque(false);
        setText("Relatorio");
        setBorder(null);
        setForeground(new Color(224,224,224));
        this.setBackground((new Color(0,153,102)));
        addActionListener(this);
        addMouseListener(this);
    }
    @Override
    protected void paintComponent(Graphics graf) {
        
        Graphics2D gr=(Graphics2D)graf;
        gr.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
       GradientPaint g = new GradientPaint(0,0,Color.decode(new Cor().getCorVerde()),0,getHeight(),Color.decode(new Cor().getCorVerde()));
        gr.setPaint(g);
        gr.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        
        super.paintComponent(graf); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setOpaque(false);
        
          gr(getGraphics());
         
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setOpaque(false);
        setBorder(null);
        gr2(getGraphics());
    }
    public Graphics gr(Graphics graf){
       Graphics2D gr=(Graphics2D)graf;
        gr.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    GradientPaint g = new GradientPaint(0,0,Color.decode(new Cor().getCorVerde()),0,getHeight(),Color.decode(new Cor().getCorVerde()));
    gr.setPaint(g);
        gr.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
       
        
       return getComponentGraphics(graf);
    }
     public Graphics gr2(Graphics graf){
       Graphics2D gr=(Graphics2D)graf;
        gr.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    GradientPaint g = new GradientPaint(0,0,Color.decode(new Cor().getCorBranca()),0,getHeight(),Color.decode(new Cor().getCorVerde()));
     gr.setPaint(g);
        gr.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        gr.setColor(Color.white);
        
       return getComponentGraphics(graf);
    }
    
}
