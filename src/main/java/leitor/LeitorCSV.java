
package leitor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeitorCSV {
    
    
     public boolean buscaLoginArquivoCsv(String diretorioArquivoCSV, String login, String senha) {
         
        boolean loginNaBase = false;
        
        File arquivo = new File(diretorioArquivoCSV);
        ArrayList<String> dadosLeitura = new ArrayList<String>();
        
        //cria arraylist para guardar as linhas do arquivo
        FileReader leitor = null;
        String line = "";
        try {
            leitor = new FileReader(arquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader saida = new BufferedReader(leitor);

        try {
            while ((line = saida.readLine()) != null) {
                dadosLeitura.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int linecount = 0;
        for (String value : dadosLeitura) {
            //percorrer as linhas do Array
            //System.out.println(value);
            String[] linevalue = value.split(";");
            for (int j = 0; j < linevalue.length; j++) {
                System.out.println(linevalue[j]);
            }
            if ((linevalue[1].equals(login))&&(linevalue[2].equals(senha))) {
                loginNaBase = true;
            }
            linecount++;
        }    

        return loginNaBase;
    }
}

