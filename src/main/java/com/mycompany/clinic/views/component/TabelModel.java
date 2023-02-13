/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinic.views.component;

import com.mycompany.clinic.modules.paciente.Paciente1;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author trido
 */
public class TabelModel extends AbstractTableModel{
List<Paciente1>paciente;
    String header[] = {"Id", "Data.Reg", "Nome",
        "Data de Nascimento", "BI", "Telefone",
        "Dentista.resp."};

public TabelModel(){
    paciente=new ArrayList<>();
}

    @Override
    public String getColumnName(int column) {
        return header[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
   

@Override
    public void addTableModelListener(TableModelListener l) {
        super.addTableModelListener(l); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public void addItem(Paciente1 pacient){
       this.paciente.add(pacient);
       this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return paciente.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:return rowIndex+1;  
               
             case 1:
                 return paciente.get(rowIndex).getData_Reg();
             case 2:
                 return paciente.get(rowIndex).getNome();
             case 3:
                 return paciente.get(rowIndex).getData_de_Nascimento();
             case 4:
                 return paciente.get(rowIndex).getBI();
             case 5:
                 return paciente.get(rowIndex).getTelefone();
             case 6:
                 return paciente.get(rowIndex).getDentista_resp(); 
            default:
                throw new AssertionError();
        }
    }
}
