package com.jeril.car;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Jeril.Kuruvila on 2015/03/29.
 */
@DatabaseTable(tableName = "numplates")
public class NumPlate {

    @DatabaseField(id = true)
    private String number= null;
    public NumPlate()
    {

    }
    public NumPlate(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        System.out.printf("Number Plate :"+number);
        return null;
    }
}
