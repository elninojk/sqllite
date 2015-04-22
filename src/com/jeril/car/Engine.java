package com.jeril.car;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Jeril.Kuruvila on 2015/03/29.
 */
@DatabaseTable(tableName = "engines")
public class Engine {

    @DatabaseField(id = true)
    private String engineName = null;

    @DatabaseField(dataType = DataType.STRING)
    private String engineNumber= null;

    @DatabaseField(foreign = true)
    private Piston piston = null;

    @DatabaseField(foreign = true)
    private TimingBelt timeingBelt = null;

    public Engine()
    {

    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public Piston getPiston() {
        return piston;
    }

    public void setPiston(Piston piston) {
        this.piston = piston;
    }

    public TimingBelt getTimeingBelt() {
        return timeingBelt;
    }

    public void setTimeingBelt(TimingBelt timeingBelt) {
        this.timeingBelt = timeingBelt;
    }

}
