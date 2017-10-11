package info.threefour.headfirst.ch0202;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable{
    private float temperature;
    private float humidity;
    private float pressure;
    
    public WeatherData() {}
    
    public void measurementsChanged() {
        setChanged();      
        notifyObservers(); // no parameter meen use PULL model.
    }
    
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    
    public float getTemperature() {
        return temperature;
    }
    
    public float getHumidity() {
        return humidity;
    }
    
    public float getPressure() {
        return pressure;
    }
}
