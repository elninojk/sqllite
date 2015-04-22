package com.jeril.car;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.jeril.Utility;

/**
 * Created by Jeril.Kuruvila on 2015/03/29.
 */
@DatabaseTable(tableName = "cars")
public class Car {

    @DatabaseField(id = true)
    private String name= null;

    @DatabaseField(foreign = true)
    private Engine engine = null;

    @DatabaseField(foreign = true)
    private Model model = null;

    @DatabaseField(foreign = true)
    private NumPlate numPlate =null;

//    java.lang.IllegalArgumentException: Can't find a no-arg constructor for class com.jeril.car.Car
    public Car()
    {

    }
    public Car(String name, Engine engine, Model model, NumPlate numPlate) {
        this.name = name;
        this.engine = engine;
        this.model = model;
        this.numPlate = numPlate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public NumPlate getNumPlate() {
        return numPlate;
    }

    public void setNumPlate(NumPlate numPlate) {
        this.numPlate = numPlate;
    }
}
