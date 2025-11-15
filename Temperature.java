public class Temperature {
    float celsius;
    float farenheit;
    int counter;

    Temperature(float celsius)
    {
        this.celsius = celsius;
        this.farenheit = toFarenheit(celsius);
    }

    public float toFarenheit(float celsius)
    {
        farenheit = (celsius * 9/5) + 32;
        return farenheit;
    }

    public void changeTemperature(float new_celsius)
    {
        celsius = new_celsius;
    }

    public void printTemperature()
    {
        System.out.println("City " + counter + " Temperature: " + celsius + " °C" + " (" + farenheit + " °F)");
        System.out.println("---------------\n");
    }
    
    public void printTemperatureTable()
    {
        System.out.printf("| %5d | %10.2f °C | %10.2f °F |\n", counter, celsius, farenheit);
    }
}
