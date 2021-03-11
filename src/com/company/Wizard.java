package com.company;

public class Wizard extends WizardParametres implements WizardLightning, WizardFire {

    public Wizard(String wizardName, String wizardUnit) {
        super(wizardName, wizardUnit);
    }

    @Override
    protected String wizardRun() {
        String wizardRun = "исчезает";
        return wizardRun;
    }

    @Override
    public String wizardFirstAttack() {
        String wizardFirstAttack = "выпускает молнии из рук";
        return wizardFirstAttack;
    }

    @Override
    public String wizardSecondAttack() {
        String wizardSecondAttack = "выпускает огненные шары";
        return wizardSecondAttack;
    }

    @Override
    public String wizardProtection() {
        String wizardProtection = "телепортируется ему за спину";
        return wizardProtection;
    }
}
