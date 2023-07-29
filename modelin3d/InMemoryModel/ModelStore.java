package modelin3d.InMemoryModel;

public class ModelStore {
    public PoligonalModel models;
    public Scene scenes;
    public Flash flashes;
    public Camera cameras;
    private IModelChangeObserver changeObservers;

    public ModelStore (PoligonalModel models, Scene  scenes, Flash flashes, Camera cameras){
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
    }
    private ModelStore (IModelChangeObserver changeObservers){
        this.changeObservers = changeObservers;
    }

    public Scene GetScene(int scene){
        return scene;
    }

    public NotifyChange(IModelChanger sender){
        return sender;
    }
}