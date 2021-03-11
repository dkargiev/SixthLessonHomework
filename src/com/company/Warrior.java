package com.company;

public class Warrior extends WarriorParametres implements WarriorInfantryman {

    @Override
    public String warriorAttack() {
        String warriorAttack = "берет меч и размахивает им";
        return warriorAttack;
    }

    @Override
    public String warriorProtection() {
        String warriorProtection = "выставляет щит";
        return warriorProtection;
    }

    @Override
    protected String warriorRun() {
        String warriorRun = "получает ранения и убегает с поля битвы";
        return warriorRun;
    }
}
