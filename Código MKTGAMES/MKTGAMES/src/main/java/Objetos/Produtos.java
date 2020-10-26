package Objetos;
public class Produtos {

private String nome;
private String descricao;
private float preco;
private float preco_venda;
private String produtora;

//GET e SET
public String getNome() {
return nome;
}

public void setNome(String nome) {
this.nome = nome;
}

public String getDescricao() {
return descricao;
}

public void setDescricao(String descricao) {
this.descricao = descricao;
}

public float getPreco() {
return preco;
}

public void setPreco(float preco) {
this.preco = preco;
}

public float getPreco_venda() {
return preco_venda;
}

public void setPreco_venda(float preco_venda) {
this.preco_venda = preco_venda;
}

public String getProdutora() {
return produtora;
}

public void setProdutora(String produtora) {
this.produtora = produtora;
}
}
