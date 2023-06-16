/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autenticavel;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.text.DateFormatter;

/**
 *
 * @author Aluno
 */
public class Util {
    // metodo static formatic data
    public static String formatarData(LocalDate data){
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return formatar.format(data);
    }
    
    // metodo formatar monetario
    public static String formatarMonetario(double valor){
        NumberFormat formatar = NumberFormat.getCurrencyInstance();
        return formatar.format(valor);
    }
    
}
