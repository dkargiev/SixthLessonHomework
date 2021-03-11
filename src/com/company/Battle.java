package com.company;

public class Battle {

    public void start() {

        Warrior warrior = new Warrior();
        Wizard wizard = new Wizard("Медив", "Маг");

        System.out.println(warrior.getWarriorUnit() + " " + warrior.getWarriorName() + " " + warrior.warriorAttack());
        System.out.println(wizard.getWizardName() + " " + wizard.wizardProtection());
        System.out.println(wizard.getWizardUnit() + " " + wizard.wizardFirstAttack());
        System.out.println(warrior.getWarriorUnit() + " " + warrior.warriorProtection());
        System.out.println(wizard.getWizardUnit() + " " + wizard.getWizardName() + " " + wizard.wizardSecondAttack());
        System.out.println(warrior.getWarriorName() + " " + warrior.warriorRun());
        System.out.println(wizard.getWizardName() + " " + wizard.wizardRun());
        System.out.println(warrior.getWarriorName() + " " + warrior.perish());
    }
}