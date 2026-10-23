package software.factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    // Método para abrir conexão com o banco de dados

    public Connection createConnection() throws Exception {

        var host = "jdbc:postgresql://localhost:5435/bd-atendimentos";
        var user = "coti";
        var pass = "coti";

        return DriverManager.getConnection(host, user, pass);
    }
}
