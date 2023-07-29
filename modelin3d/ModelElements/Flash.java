package modelin3d.ModelElements;

public class Flash {
    public Point3D Location;
    public Angle3D Angle;
    public Color color;
    public float Power;

    // Конструктор
    public Flash(Point3D Location, Angle3D Angle, Color color, float Power) {
        this.Location = Location;
        this.Angle = Angle;
        this.color = color;
        this.Power = Power;
    }

    // Методы для поворота и перемещения молнии
    public void rotate(Angle3D newAngle) {
        System.out.println("Angle rotated");
    }

    public void Move(Point3D newXYZ) {
        System.out.println("Location moved");
    }
}
