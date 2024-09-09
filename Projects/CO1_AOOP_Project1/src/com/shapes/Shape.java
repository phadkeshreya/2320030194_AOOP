package com.shapes;

public abstract class Shape {
protected DrawAPI drawAPI;
    
    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
    
    public abstract String draw(); 
}
