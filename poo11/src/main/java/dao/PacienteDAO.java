package dao;

import app.Paciente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAO {

    // 1. Criar a tabela se não existir
    public static void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS pacientes (\n"
                + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + " nome TEXT NOT NULL,\n"
                + " email TEXT,\n"
                + " telefone TEXT,\n"
                + " documento TEXT,\n"
                + " convenio TEXT\n"
                + ");";

        try (Connection conn = Conexao.conectar();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela 'pacientes' criada ou já existente.");
        } catch (SQLException e) {
            System.err.println("Erro ao criar tabela de pacientes: " + e.getMessage());
        }
    }

    // 2. Inserir Paciente no Banco
    public static void inserir(Paciente paciente) {
        String sql = "INSERT INTO pacientes(nome, email, telefone, documento, convenio) VALUES(?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, paciente.getNome());
            pstmt.setString(2, paciente.getEmail());
            pstmt.setString(3, paciente.getTelefone());
            pstmt.setString(4, paciente.getDocumento());
            pstmt.setString(5, paciente.getConvenio());

            pstmt.executeUpdate();
            System.out.println("Paciente inserido com sucesso no banco!");

        } catch (SQLException e) {
            System.err.println("Erro ao inserir paciente: " + e.getMessage());
        }
    }
}