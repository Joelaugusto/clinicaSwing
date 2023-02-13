/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinic.modules.paciente;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author tridon
 */
@Entity
@Table(name = "paciente")
public class Paciente1 implements Serializable{

    public Paciente1() {
    }

    
    public void Paciente1(String Data_Reg, String Nome, String Data_de_Nascimento, String BI, String Telefone, String Dentista_resp) {
        this.Data_Reg = Data_Reg;
        this.Nome = Nome;
        this.Data_de_Nascimento = Data_de_Nascimento;
        this.BI = BI;
        this.Telefone = Telefone;
        this.Dentista_resp = Dentista_resp;

    }
    

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getData_Reg() {
        return Data_Reg;
    }

    public void setData_Reg(String Data_Reg) {
        this.Data_Reg = Data_Reg;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getData_de_Nascimento() {
        return Data_de_Nascimento;
    }

    public void setData_de_Nascimento(String Data_de_Nascimento) {
        this.Data_de_Nascimento = Data_de_Nascimento;
    }

    public String getBI() {
        return BI;
    }

    public void setBI(String BI) {
        this.BI = BI;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getDentista_resp() {
        return Dentista_resp;
    }

    public void setDentista_resp(String Dentista_resp) {
        this.Dentista_resp = Dentista_resp;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long Id;
    private String Data_Reg;
    private String Nome;
    private String Data_de_Nascimento;
    private String BI;
    private String Telefone;
    private String Dentista_resp;
    
    
}
