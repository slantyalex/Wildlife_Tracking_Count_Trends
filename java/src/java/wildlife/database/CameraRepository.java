package wildlife.database;

import wildlife.camera.Camera;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CameraRepository {
    public void save(Camera camera) throws SQLException {
        String sql = "INSERT INTO camera (name, location, manufacturer, model, active) VALUES (?, ?, ?, ?, ?)";

        try(Connection connection = Database.connect()){
            PreparedStatement statement = connection.prepareStatement(sql);

            connection.setAutoCommit(true);

            statement.setString(1, camera.get_name());
            statement.setString(2, camera.get_location());
            statement.setString(3, camera.get_manufacturer());
            statement.setString(4, camera.get_model());
            statement.setBoolean(5, camera.is_active());

            statement.executeUpdate();
        }
    }

    public void update(Camera camera) throws SQLException{
        String sql = "UPDATE camera SET name = ?, location =  ?, manufacturer = ?, model = ?, active = ? WHERE id = 1;";

        try(Connection connection = Database.connect()){
            PreparedStatement statement =  connection.prepareStatement(sql);

            connection.setAutoCommit(true);

            statement.setString(1, camera.get_name());
            statement.setString(2, camera.get_location());
            statement.setString(3, camera.get_manufacturer());
            statement.setString(4, camera.get_model());
            statement.setBoolean(5, camera.is_active());

            statement.executeUpdate();
        }
    }

    public void delete() throws SQLException{
        String sql = "DELETE FROM camera WHERE id = 1;";

        try(Connection connection = Database.connect()){
            PreparedStatement statement =  connection.prepareStatement(sql);
            statement.executeUpdate();
        }

    }
}
