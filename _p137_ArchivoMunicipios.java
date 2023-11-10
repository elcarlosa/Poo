import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class _p137_ArchivoMunicipios {
    public static void main(String[] args) {
        String[] deportes = {"Fútbol", "Béisbol", "Ciclismo", "Atletismo", "Natacion", "Motociclismo"};
        File arch = new File("Deportes.txt");

          if(arch.exists())
                  System.out.println("El archivo ya existe !");
        else{
            try{
                BufferedWriter fdeportes = new BufferedWriter(new FileWriter(arch));
                for (String deporte : deportes)
                fdeportes.write(deporte+"\n");
                fdeportes.close();
                System.out.println("Datos registrados...");
            } catch (Exception e){
                System.out.println("Problema al procesar el archivo...");
                System.out.println(e);
            }
        }
        if (!arch.exists()) {
            System.out.println("El archivo no existe !");
        }
        else{
            try{
                BufferedReader fdeportes = new BufferedReader(new FileReader(arch));
                String Linea;
                while ((Linea=fdeportes.readLine())!=null) {
                    System.out.println(Linea);
                }
                fdeportes.close();
            }catch (Exception e){
                System.out.println("Problemas al procesar el archivo..");
                System.out.println(e);
            }
        System.out.println("Longitud final el archivo escrito "+ arch.length());
    }
}
}

