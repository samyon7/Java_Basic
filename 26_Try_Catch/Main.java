import java.io.*;

public class Main{
    public static void main(String[] args){
        try {
            File file = new File("D://latihan.txt");
            FileReader reader = new FileReader(file);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        /* You can use multiple exception too
        catch (condition 1){
            ...
        }
        catch (condition 2){
            ...
        }
        catch (condition 3){
            ...
        }
        catch (condition n){
            ...
        }
        */
    }
}