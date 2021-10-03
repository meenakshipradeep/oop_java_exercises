package com.techreturners.cats;

public abstract class GeneralCat implements Cat{

    public String setting;
    public int averageHeight;
    public String catSound;
    private Boolean asleep = false;

    public GeneralCat(String setting,int averageHeight,String catSound)
    {
        this.setting=setting;
        this.averageHeight=averageHeight;
        this.catSound=catSound;
    }

    public String getSetting() {
        return this.setting;
    }

    public int getAverageHeight() {
        return this.averageHeight;
    }

    public boolean isAsleep(){
        return this.asleep;

    }
    public void goToSleep(){
        this.asleep =true;

    }
    public String eat(){
        return this.catSound;
    }

    public void wakeUp(){
        this.asleep =false;
    }

}
