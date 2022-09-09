package com.example.EcommerceCliente;


import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class ProdutoCliente {


    // SALVAR
    public Produto salvar(Produto produto) {
        HttpResponse<String> response = null;
        Produto produto1 = null;

        try {
            response = Unirest.post("http://localhost:8080/produto/salvar")  // vai pegar a Url do Postman da outra aplicação Backend
                    .header("Content-Type", "application/json")  // configurando o Json
                    .body(JSonUtil.asJsonString(produto)).asString(); // converte o objeto em json
            produto1 = JSonUtil.objectFromString(Produto.class,response.getBody());  // Fará a conversão de Json para objeto, passa a classe e o que será convertido

        } catch (Exception e) {
            e.printStackTrace();
        }
        return produto1;
    }


    // BUSCAR POR ID
    public Produto buscarPorId(Integer id) {
        HttpResponse<String> response = null;
        Produto produto1 = null;

        try {
            response = Unirest.get("http://localhost:8080/produto/todos").asString();  // vai pegar a Url do Postman da outra aplicação Backend

            produto1 = JSonUtil.objectFromString(Produto.class,response.getBody());  // Fará a conversão de Json para objeto, passa a classe e o que será convertido

        } catch (Exception e) {
            e.printStackTrace();
        }
        return produto1;
    }


    // ALTERAR
    public Produto alterar(Produto produto) {
        HttpResponse<String> response = null;
        Produto produto1 = null;

        try {
            response = Unirest.put("http://localhost:8080/produto/alterar")  // vai pegar a Url do Postman da outra aplicação Backend
                    .header("Content-Type", "application/json")  // configurando o Json
                    .body(JSonUtil.asJsonString(produto)).asString(); // converte o objeto em json
            produto1 = JSonUtil.objectFromString(Produto.class,response.getBody());  // Fará a conversão de Json para objeto, passa a classe e o que será convertido

        } catch (Exception e) {
            e.printStackTrace();
        }
        return produto1;
    }

    //EXCLUIR
    public String excluir(Integer id){
        HttpResponse<String> response = null;
        Produto produto1 = null;

        try {
            response = Unirest.delete("http://localhost:8080/produto/"+id).asString();  // vai pegar a Url do Postman da outra aplicação Backend


        } catch (Exception e) {
            e.printStackTrace();
        }
        return response != null ? String.valueOf(response.getStatus()) : null;
    }
}
