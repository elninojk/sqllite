package com.jeril.car;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.sun.javafx.sg.PGShape;

/**
 * Created by Jeril.Kuruvila on 2015/03/29.
 */
@DatabaseTable(tableName = "models")
public class Model {
    @DatabaseField(id = true)
    private String model = null;
    public Model()
    {

    }
    public Model(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
