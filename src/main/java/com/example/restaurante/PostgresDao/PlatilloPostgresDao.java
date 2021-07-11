package com.example.restaurante.PostgresDao;



import com.example.restaurante.DAO.PlatilloDAO;
import com.example.restaurante.Dominio.Platillo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.*;


@Repository
public class PlatilloPostgresDao implements PlatilloDAO {

    private final String url = "jdbc:postgresql://localhost/facturacion-dev";
    private final String user = "postgres";
    private final String password = System.getenv("DB-PASS");

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
    public void crearPlatillo(Platillo platillo) {
        String SQL = "INSERT INTO platillo(nombre,descripcion,precio,guarniciones) "
                + "VALUES(?,?,?,?)";

        System.out.println(password);

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL,
                     Statement.RETURN_GENERATED_KEYS)) {

            pstmt.setString(1, platillo.getNombre());
            pstmt.setString(2, platillo.getDescripcion());
            pstmt.setInt   (3, platillo.getPrecio());
            pstmt.setString(4, platillo.getPosiblesGuarniciones());

            int affectedRows = pstmt.executeUpdate();
            // check the affected rows
            if (affectedRows > 0) {
                System.out.println("Row inserted");
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
