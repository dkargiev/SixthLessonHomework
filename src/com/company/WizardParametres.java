package com.company;

public abstract class WizardParametres {

    protected String wizardName;
    protected String wizardUnit;

    protected WizardParametres(String wizardName, String wizardUnit){
        this.wizardName = wizardName;
        this.wizardUnit = wizardUnit;
    }

    public String getWizardName() {
        return wizardName;
    }

    public String getWizardUnit() {
        return wizardUnit;
    }

    protected abstract String wizardRun();
}
