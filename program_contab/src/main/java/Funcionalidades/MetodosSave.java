package Funcionalidades;

import Funcionalidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class MetodosSave {

	public void criarRegistroBD(Cliente c) {
		Connection con = Connector.conectar();
		PreparedStatement stmt = null;
		String sql = "INSERT INTO cliente (cpf_cnpj, nome) VALUES (?, ?)";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, c.getCpfCnpj());
			stmt.setString(2, c.getRazaoSocial());
			
			stmt.executeUpdate();
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao salvar os dados na tela");
		}finally{
			Connector.desconectar(con, stmt);
		}
	}
}
