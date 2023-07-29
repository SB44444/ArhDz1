package modelin3d.ModelElements;

public class Scene {
    public int id;
    public PoligonaModels Models;
    public Flash Flashes;


    public Scene (int id, PoligonaModels Models, Flash Flashes){
        this.id = id;
        this.Models= Models;
        this.Flashes = Flashes;
    }

    public Type method1 (Type x){
        return x;
    }

    public Type method2 (Type x, Type y){
        return x, y;
    }
}