package wildlife;

import wildlife.database.Database;
import wildlife.database.CameraRepository;
import wildlife.camera.Camera;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main{
    public static void main(String[] args) throws SQLException{
        CameraRepository camera_repo = new CameraRepository();

        Camera camera = new Camera(
            "Home",
            "Duluvulu",
            "DC101",
            false
        );

        camera_repo.save(camera);
    }
}
