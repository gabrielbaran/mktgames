package Objetos;
public class Cadastro_Clientes {
    
private String nome;
private String cpf;
private String sexo;
private String data_nascimento;
private String endereco;
private String cidade;
private String estado;
private String email;
private String senha;

//GET e SET
public String getNome() {
return nome;
}

public void setNome(String nome) {
this.nome = nome;
}

public String getCpf() {
return cpf;
}

public void setCpf(String cpf) {
this.cpf = cpf;
}

public String getSexo() {
return sexo;
}

public void setSexo(String sexo) {
this.sexo = sexo;
}

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }



public String getEndereco() {
return endereco;
}

public void setEndereco(String endereco) {
this.endereco = endereco;
}

public String getCidade() {
return cidade;
}

public void setCidade(String cidade) {
this.cidade = cidade;
}

public String getEstado() {
return estado;
}

public void setEstado(String estado) {
this.estado = estado;
}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }



}
