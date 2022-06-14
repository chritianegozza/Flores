import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;


class DataAniversario
{
    public static void main (String[] args) throws java.lang.Exception {
        
        System.out.println("Digite a data do seu aniversário: ");
        System.out.println("Esta data é válida! " + new DataValida().hValidado("10/10/2000"));
        System.out.println("Esta data é inválida! " + new DataValida().hValidado("10122000"));
    }
}

class DataValida {

    public boolean hValidado(String date) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate d = LocalDate.parse(date,formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}