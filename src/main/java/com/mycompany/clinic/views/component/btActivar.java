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
import javax.swing.JButton;

/**
 *
 * @author trido
 */
public class btActivar extends JButton{

    public btActivar() {
        setOpaque(false);
        setText("Activar");
        setBorder(null);
        setForeground(Color.white);
        this.setBackground((new Color(0,153,102)));
    }
    
  @Override
    protected void paintComponent(Graphics graf) {
        
        Graphics2D gr=(Graphics2D)graf;
        gr.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
       GradientPaint g = new GradientPaint(0,0,Color.decode(new Cor().getCorCinza()),0,getHeight(),Color.decode(new Cor().getCorCinza()));
        gr.setPaint(g);
        gr.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        
        super.paintComponent(graf); 
    }
    
}
