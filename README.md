# Buscador de CEP

Quarto desafio proposto da instrutora da Alura: Jacqueline Oliveira na linguagem Java.<br> 
Este desafio consiste em consultar um endereço a partir de um CEP e salvar as informações em um arquivo json através da linguagem Java.<br>
Esse projeto esta bem detalhado e sem usar a classe Record do Java.
| :placard: Vitrine.Dev | https://cursos.alura.com.br/vitrinedev/marcosfshirafuchi    |
| -------------  | --- |
| :sparkles: Nome        | **Buscador de CEP**
| :label: Tecnologias | Java, Postman e Json (tecnologias utilizadas)
| :rocket: URL         | 
| :fire: Desafio     | https://github.com/alura-cursos/2944-java-desafio

<!-- Inserir imagem com a #vitrinedev ao final do link -->

![thumbnail-Desafio Java (2)](https://user-images.githubusercontent.com/66698429/227000674-0d88d9f6-cef8-47c3-87b4-b83ff7db4a13.png?text=imagem+lindona+do+meu+projeto#vitrinedev)

## Detalhes do projeto

# Desafio


Vamos implementar uma aplicação para consultar um endereço a partir de um CEP e salvar as informações em um arquivo json.


## 🔨 Objetivos do projeto

- Criar uma classe que representa um endereço (cep, uf, cidade, bairro, logradouro e complemento);
- Criar uma classe que consulta a API *ViaCEP* para buscar um endereço a partir de um cep (exemplo: https://viacep.com.br/ws/04101300/json);
- Criar uma classe que cria um arquivo json contendo os dados de um objeto `Endereco`;
- Criar uma classe com método main que deve solicitar ao usuário que informe um CEP e na sequencia utilizar as classes para consultar a api ViaCEP e salvar os dados do endereço em um arquivo json.

## Observações:
- Utilize a biblioteca GSon para converter o JSON devolvido pela API ViaCEP em um objeto `Endereco`;
- Utilize a biblioteca GSon para salvar um objeto `Endereco` em um arquivo .json;
- O arquivo deve ter como nome o cep informado (exemplo: `04101300.json`);



