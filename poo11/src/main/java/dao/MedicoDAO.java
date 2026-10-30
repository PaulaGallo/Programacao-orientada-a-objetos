package dao;

import app.Medico;
import java.sql.*;

public class MedicoDAO {

    public static void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS medicos (\n"
                + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + " nome TEXT NOT NULL,\n"
                + " email TEXT,\n"
                + " telefone TEXT,\n"
                + " crm TEXT,\n"
                + " especialidade TEXT\n"
                + ");";

        try (Connection conn = Conexao.conectar();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela 'medicos' criada ou já existente.");
        } catch (SQLException e) {
            System.err.println("Erro ao criar tabela de medicos: " + e.getMessage());
        }
    }

    public static void inserir(Medico medico) {
        String sql = "INSERT INTO medicos(nome, email, telefone, crm, especialidade) VALUES(?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, medico.getNome());
            pstmt.setString(2, medico.getEmail());
            pstmt.setString(3, medico.getTelefone());
            pstmt.setString(4, medico.getCrm());
            pstmt.setString(5, medico.getEspecialidade());

            pstmt.executeUpdate();
            System.out.println("Médico inserido com sucesso no banco!");

        } catch (SQLException e) {
            System.err.println("Erro ao inserir médico: " + e.getMessage());
        }
    }
}