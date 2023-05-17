package Funcionalidades;

import Funcionalidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.protocol.Resultset;

public class MetodosSave {

	public void criarRegistroClienteBD(Cliente c) throws SQLException {
		Connection con = Connector.conectar();
		PreparedStatement stmt = null;
		String sql = "INSERT INTO cliente (cpf_cnpj, cep, telefone, inscricao_municipal, email, razao_social,"
				+ " razao_reduzida, data_de_cadastro, num_endereco, indicacao, complemento, bairro, end_uf)"
				+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, c.getCpfCnpj());
			stmt.setString(2, c.getCep());
			stmt.setString(3, c.getTelefone());
			stmt.setString(4, c.getInscricaoMunicipal());
			stmt.setString(5, c.getEmail());
			stmt.setString(6, c.getRazaoSocial());
			stmt.setString(7, c.getRazaoReduzida());
			stmt.setString(8, c.getDataCadastro());
			stmt.setString(9, c.getNumeroEndereco());
			stmt.setString(10, c.getIndicacao());
			stmt.setString(11, c.getComplemento());
			stmt.setString(12, c.getBairro());
			stmt.setString(13, c.getUfEndereco());
			
			stmt.executeUpdate();
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao salvar os dados na tela, exceção método save");
		}finally{
			Connector.desconectar(con, stmt);
		}
	}
	
	public ArrayList<Cliente> listarDadosCliente(){
		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
		Connection con = Connector.conectar();
		PreparedStatement stmt = null;
		String sql = "SELECT * from cliente";
		
		try {
			stmt = con.prepareStatement(sql);
			ResultSet resposta = stmt.executeQuery(sql);
			
			while(resposta.next()) {
				
				String cpfCnpj = resposta.getString("cpf_cnpj");
				String razaoSocial = resposta.getString("razao_social");
				String inscMunicipal = resposta.getString("inscricao_municipal");
				String email = resposta.getString("email");
				
				Cliente c = new Cliente(cpfCnpj, razaoSocial, inscMunicipal, email);
				cliente.add(c);
			}
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao listar dados na tabela.");
		} finally {
			Connector.desconectar(con, stmt);
		}
		return cliente;
	} 
	
}

