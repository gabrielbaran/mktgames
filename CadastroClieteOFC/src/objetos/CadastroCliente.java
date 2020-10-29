/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;
import objetos.Cliente;

public class CadastroCliente {
       
    private ArrayList<Cliente> cliente = new ArrayList<>();
    
    public boolean salvar (Cliente v) {
        if (v != null) {
            cliente.add(v);
            return true;
        }else{
            return false;
        }
    }
        public ArrayList<Cliente> voltarTudo    () {
            return cliente;
        }
}
