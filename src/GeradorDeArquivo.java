/*Tarefa do desafio:
3 - Geração de um arquivo JSON com os dados do endereço

Desafio desenvolvido por Marcos Ferreira Shirafuchi na linguagem Java.
*/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

//Classe Gerador de arquivo
public class GeradorDeArquivo {

    //Método que gera o arquivo Json
    public void salvaJson(Endereco endereco) throws IOException {
        // Serializar o arquivo: transforma o objeto para Json
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter(endereco.getCep()+".json");
        escrita.write(gson.toJson(endereco));
        escrita.close();
    }
}
