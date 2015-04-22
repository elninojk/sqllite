package com.jeril.sql;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.jeril.car.*;

/**
 * Created by Jeril.Kuruvila on 2015/03/29.
 */
public class SequelWriter {

    public static void main(String[] args) throws Exception{

        // this uses h2 by default but change to match your database
        String databaseUrl = "jdbc:h2:mem:account";
        // create a connection source to our database
        ConnectionSource connectionSource =
                new JdbcConnectionSource(databaseUrl);


        // instantiate the dao
        Dao<Car, String> carDao =
                DaoManager.createDao(connectionSource, Car.class);
        Dao<Engine, String> engineDao =
                DaoManager.createDao(connectionSource, Engine.class);

        // if you need to create the 'accounts' table make this call
        TableUtils.createTable(connectionSource, Car.class);
        TableUtils.createTable(connectionSource, Engine.class);
        TableUtils.createTable(connectionSource, Model.class);

        // create an instance of Account
        Car car = new Car();
        car.setName("Audi");


        Engine engine = new Engine();
        engine.setEngineName("E1");
        engine.setEngineNumber("123456");
            Piston piston = new Piston();
            piston.setPiston(1);
        engine.setPiston(piston);
            TimingBelt belt = new TimingBelt();
            belt.setBelt(1);
        engine.setTimeingBelt(belt);

        engineDao.create(engine);
        car.setEngine(engine);

            Model model =new Model("1985");
        car.setModel(model);
            NumPlate plate = new NumPlate("VNF 699 GP");
        car.setNumPlate(plate);

//        car.toString();
        carDao.create(car);

//        connectionSource.toString();
        Car retCar = carDao.queryForId("Audi");
        if (retCar != null) {
            System.out.println(" ==============RET DATA====================");
            System.out.println(" Car Name::"+ retCar.getName());
            System.out.println(" Engine  Name::"+ retCar.getEngine().getEngineName());
            System.out.println(" Engine  Model::"+ retCar.getModel().getModel());
            System.out.println(" Num Plate::"+ retCar.getNumPlate().getNumber());
            Engine retEngine = engineDao.queryForId(retCar.getEngine().getEngineName());

            if (retEngine != null)
            {
                System.out.println("Engine number "+ retEngine.getEngineNumber());
                System.out.println("Piston "+ retEngine.getPiston().getPiston());
                System.out.println("Belt "+ retEngine.getTimeingBelt().getBelt());
            }

        } else {
            System.out.println(" ==============NULL====================");
        }



        connectionSource.close();


    }
}
