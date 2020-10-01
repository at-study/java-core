package lections.lesson4.car_factory;

public class Door {
    private Object glass;
    private Object handle;

    Door(Object glass, Object handle) {
        this.glass = glass;
        this.handle = handle;
    }

    public void setGlass(Object glass) {
        this.glass = glass;
    }

    public Object getHandle() {
        return handle;
    }

}
