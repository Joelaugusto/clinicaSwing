/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clinic.modules.documents.service.seting;

import java.time.LocalDateTime;

/**
 *
 * @author trido
 */
public class Time1 {
protected LocalDateTime date;
    public Time1() {
       date=LocalDateTime.now();
    }

    public LocalDateTime getDate() {
        return date;
    }
    
    
}
