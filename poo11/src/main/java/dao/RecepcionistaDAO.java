package dao;

import app.Recepcionista;
import java.sql.*;

public class RecepcionistaDAO {

    public static void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS recepcionistas (\n"
                + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                + " nome TEXT NOT NULL,\n"
                + " email TEXT,\n"
                + " telefone TEXT,\n"
                + " documento TEXT,\n"
                + " turno TEXT\n"
                + ");";

        try (Connection conn = Conexao.conectar();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela 'recepcionistas' criada ou já existente.");
        } catch (SQLException e) {
            System.err.println("Erro ao criar tabela de recepcionistas: " + e.getMessage());
        }
    }

    public static void inserir(Recepcionista recepcionista) {
        String sql = "INSERT INTO recepcionistas(nome, email, telefone, documento, turno) VALUES(?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, recepcionista.getNome());
            pstmt.setString(2, recepcionista.getEmail());
            pstmt.setString(3, recepcionista.getTelefone());
            pstmt.setString(4, recepcionista.getDocumento());
            pstmt.setString(5, recepcionista.getTurno());

            pstmt.executeUpdate();
            System.out.println("Recepcionista inserida com sucesso no banco!");

        } catch (SQLException e) {
            System.err.println("Erro ao inserir recepcionista: " + e.getMessage());
        }
    }
}