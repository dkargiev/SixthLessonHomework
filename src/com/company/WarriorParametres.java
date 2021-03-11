package com.company;

public abstract class WarriorParametres {

    private String warriorName = "Андуин Лотар";
    private String warriorUnit = "Рыцарь";

    public String getWarriorName() {
        return warriorName;
    }

    public String getWarriorUnit() {
        return warriorUnit;
    }

    protected abstract String warriorRun();

    public String perish() {
        String perish = "погибает";
        return perish;
    }
}
