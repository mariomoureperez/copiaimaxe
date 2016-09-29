package opybytestexto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author oracle
 */
public class Opybytestexto {

    public static void main(String[] args) {
       //Creamos el flujo de los ficheros 
        File origen = new File("texto1.txt");
        File destino = new File("texto2.txt");
        
        try {
            destino.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        
                
        try {     
            FileInputStream leer =new FileInputStream(origen);
            FileOutputStream escribir = new FileOutputStream(destino,true);
            
            try {
                //leemos o ficheiro byte a byte para despois copiar cada byte no outro ficheiro hasta que o ficheiro1 de -1 significa qeu o ficheiro rematou
                int b;
                
                while((b=leer.read())!=-1){
                              
                    escribir.write(b);
                
                }
                
                                
                //cerramos o fluxo
                leer.close();
                escribir.close();
                
                
                
                
                
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }
    
}
