import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Specify the unit (C for Celsius, F for Fahrenheit): ");
        String unit = scanner.next();
            double convertedTemperature;
        if (unit.equalsIgnoreCase("C")) {
              convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.println(temperature + " degrees Celsius is equal to " + convertedTemperature + " degrees Fahrenheit.");
        } else if (unit.equalsIgnoreCase("F")) {
               convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.println(temperature + " degrees Fahrenheit is equal to " + convertedTemperature + " degrees Celsius.");
        } else {
          System.out.println("Invalid unit specified. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
        }
    }
}
   