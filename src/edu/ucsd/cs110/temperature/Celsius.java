package edu.ucsd.cs110.temperature;

import edu.ucsd.cs110.tests.FahrenheitTest;

public class Celsius extends Temperature {

    public Celsius(float t){
        super(t);
    }

    public String toString(){
        return this.getValue()+ " C";
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float value = ((this.getValue()*9)/5) + 32;
        return new Fahrenheit(value);
    }
}
