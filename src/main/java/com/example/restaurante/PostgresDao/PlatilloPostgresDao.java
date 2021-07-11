package com.example.restaurante.PostgresDao;



import com.example.restaurante.DAO.PlatilloDAO;
import com.example.restaurante.Dominio.Platillo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;


@Repository
public class PlatilloPostgresDao implements PlatilloDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void crearPlatillo(Platillo platillo) {
        String sql = "INSERT INTO platillo (nombre, descripcion, precio, guarniciones) VALUES ("
                + "'Platillo1', 'descripcion1', 12345, '1')";

        int rows = jdbcTemplate.update(sql);
        if (rows > 0) {
            System.out.println("A new row has been inserted.");
        }
    }

}
