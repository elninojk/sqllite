package com.jeril.car;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Jeril.Kuruvila on 2015/03/29.
 */
@DatabaseTable(tableName = "timingbelts")
public class TimingBelt {

    @DatabaseField(id=true)
    private int belt=0;

    public TimingBelt()
    {

    }
    public int getBelt() {
        return belt;
    }

    public void setBelt(int belt) {
        this.belt = belt;
    }

    @Override
    public String toString() {
        System.out.printf("Timing Belt type is :"+ belt);
        return  "belt";
    }
}
