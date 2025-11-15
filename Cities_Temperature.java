import java.util.ArrayList;
import java.util.List;

public class Cities_Temperature 
{
    public static void main(String[] args) 
    {
        List<Temperature> temperatures = new ArrayList<Temperature>();
        int number_of_cities = 0;
        float temp_avg = 0;

        try(java.util.Scanner scanner = new java.util.Scanner(System.in))
        {
            System.out.print("Enter the number of cities: ");
            number_of_cities = scanner.nextInt();
            for(int counter = 0; counter < number_of_cities; counter++)
            {
                System.out.print("Enter city " + (counter+1) + " temperature (in celsius): ");
                float temperature = scanner.nextFloat();

                temperatures.add(new Temperature(temperature));
                scanner.nextLine();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        number_of_cities = 1;

        System.out.println("\n--- Temperature Recordings ---");

        for(Temperature t : temperatures)
        {
            t.counter = number_of_cities++;
            t.printTemperature();
            temp_avg += t.celsius;
        }

        temp_avg /= number_of_cities;

        System.out.println("City average " + temp_avg);
    }
}
