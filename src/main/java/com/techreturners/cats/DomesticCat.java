package com.techreturners.cats;

import java.util.Random;

public  class DomesticCat extends GeneralCat {

    public DomesticCat(){
        super("domestic",23, "Purrrrrrr");
    }

    public String feedTheHappyCat(Random random) {
        String[] randomOutput = {"Purrrrrrr", "Purrrrrrr! It will do I suppose"};
        return randomOutput[random.nextInt(randomOutput.length)];
    }

}
