

/**
 * Red Haque
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Candle[] c = new Candle[100];
        int candleCounter = 0;
        //This will read from the file
        
        

        // checks if the file is found, if not throw an exception.
        try {
            Scanner scanFile;
            scanFile = new Scanner(new File("C:\\Users\\theki\\Documents\\NetBeansProjects\\JavaApplication42\\src\\javaapplication42\\input.txt"));
            while (scanFile.hasNextLine()) {
                String line = scanFile.nextLine();
                String[] tokens = line.split(",");
                if (tokens.length == 3) {
                    c[candleCounter] = new Candle(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), Float.parseFloat(tokens[2]));
                    candleCounter++;
                }
            }
            scanFile.close();
            CandleGUI candleGUI = new CandleGUI();
            String result = "";
            for (int i = 0; i < candleCounter; i++) {

                result += c[i] + "<br>";
            }
            candleGUI.label1.setText("<html>Unsorted: <br>" + result + "</html>");
            //Sort
            sort(c,candleCounter);
            String result2 ="";
            for (int i = 0; i < candleCounter; i++) {

                result2 += c[i] + "<br>";
            }
            candleGUI.label2.setText("<html>Sorted: <br>" + result2 + "</html>");
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }

    }

    
    // sorts it by comparing which one is greater or less than
    private static void sort(Candle[] candles,int n) {

        for (int i = 0; i < n - 1; i++) {

            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (candles[j].getPrice() < candles[min_idx].getPrice())
                    min_idx = j;         
        
            Candle temp = candles[min_idx];
            candles[min_idx] = candles[i];
            candles[i] = temp;
        }
    }
}