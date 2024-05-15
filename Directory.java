package Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Component{
    private List<Component> children;
    public Directory(){
        children=new ArrayList<>();
    }
    public void add(Component component) {
        children.add(component);
    }
    public int getSize() {
        int size = 0;
        for (Component component : children) {
            size += component.getSize();
        }
        return size;
    }
}


