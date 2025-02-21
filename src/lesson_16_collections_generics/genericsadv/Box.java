package lesson_16_collections_generics.genericsadv;

public class Box {
    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Box(Object obj) {
        this.obj = obj;
    }
}
