package com.durgaprasadmamidi;

class Database{
    String name;

    private Database(String name) {
        this.name = name;
    }

    public static Database instance;


    public static synchronized Database getInstance(String name){
        if(instance == null)
             instance = new Database(name);
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Main {

    public static void main(String[] args) {
        Database db = Database.getInstance("mango");
        Database db2 = Database.getInstance("useless");
        System.out.println(db.getName());
        System.out.println(db2.getName());
    }

}
