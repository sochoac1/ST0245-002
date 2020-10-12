import java.io.*;

/**
 * Write a description of class BufferedReaderClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BufferedReaderClass
{
    public  String matriz[][];
    public void readData() throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("datotes.csv"));
        String line = br.readLine();
        int count = 0;
        while((line = br.readLine())!= null){
            count++;
        }
        System.out.println(count);
        br.close();
        /////////////////////////////////////////////////////////////
        matriz = new String[count][7];
        BufferedReader br2 = new BufferedReader(new FileReader("datotes.csv"));
        int j = 0; 
        line = br2.readLine();
        while( (line = br2.readLine()) != null){
            String[] lineArray = line.split(",");
            
            for(int i = 0; i < 7; i++){
                matriz[j][i] = lineArray[i];
            }
            j++;
        }
        br2.close();
    }
}
