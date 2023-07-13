/*
Lista de tarefas:
1 - Criar uma aplicação para consultar a API ViaCEP
2 - Menu para o usuário informar o CEP para busca
3 - Geração de um arquivo JSON com os dados do endereço

Desafio desenvolvido por Marcos Ferreira Shirafuchi na linguagem Java.
* */

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //2 - Menu para o usuário informar o CEP para busca

        Scanner leitura = new Scanner(System.in);
        String cep = "";
        ConsultaCep consultaCep = new ConsultaCep();
        //O laço while continua a executar quando o valor da variavel cep for diferente valor de sair
        while (!cep.equalsIgnoreCase("sair")) {
            System.out.println("Buscador de CEP!");
            System.out.println("Menu de opções: ");
            System.out.println("Digite sair ou o número do cep para consulta:");
            cep = leitura.nextLine();
            if (cep.equalsIgnoreCase("sair")){
                break;
            }
            try {

                Endereco novoEndereco = consultaCep.buscaEndereco(cep);
                System.out.println("\nInformação sobre o CEP " + novoEndereco.getCep() + ":\n");
                System.out.println(novoEndereco);

                //3 - Geração de um arquivo JSON com os dados do endereço
                GeradorDeArquivo gerador = new GeradorDeArquivo();
                gerador.salvaJson(novoEndereco);
            } catch (RuntimeException | IOException e) {
                //Exibe a mensagem de erro
                System.out.println(e.getMessage());
                break;
            }
        }
        //Mensagem de finalizando a aplicação
        System.out.println("Finalizando a aplicação!");
    }
}