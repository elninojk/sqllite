package com.jeril.car;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Jeril.Kuruvila on 2015/03/29.
 */
@DatabaseTable(tableName = "pistons")
public class Piston {
    @DatabaseField(id=true)
    private int piston =0;
    public Piston()
    {

    }
    public void setPiston(int piston) {
        this.piston = piston;
    }

    public int getPiston() {
        return piston;
    }
}
