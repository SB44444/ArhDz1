package modelin3d.ModelElements;

public class Camera {
    public Point3D Location;
    public Angle3D Angle;

    // Конструктор
    public Camera(Point3D Location, Angle3D Angle) {
        this.Location = Location;
        this.Angle = Angle;
    }

    // Методы для камеры
    public void rotate(Angle3D inAngle) {
        System.out.println("Scene angle moved");
    }

    public void move(Point3D xyz) {
        System.out.println("Scene Location xyz");
    }
}
