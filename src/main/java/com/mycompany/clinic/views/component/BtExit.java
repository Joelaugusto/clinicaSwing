/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clinic.views.component;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;
import javax.swing.text.PlainDocument;

/**
 *
 * @author trido
 */
public class BtExit extends JButton{

    public BtExit() {
       setOpaque(false);
        setText("X");
        setBorder(null);
        setForeground(Color.white);
        this.setBackground((new Color(0,153,102)));
    }
    
      @Override
    protected void paintComponent(Graphics graf) {
        
        Graphics2D gr=(Graphics2D)graf;
        gr.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
       GradientPaint g = new GradientPaint(0,0,Color.decode(new Cor().getCorBranca()),0,getHeight(),Color.decode(new Cor().getCorVermelha()));
        gr.setPaint(g);
        gr.fillRoundRect(0, 0, getWidth(), getHeight(), 40, 40);
        
        super.paintComponent(graf); 
    }
}
