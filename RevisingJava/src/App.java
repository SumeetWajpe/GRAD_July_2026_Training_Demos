import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        
       List<? extends Number> list =  new ArrayList<Integer>(
        
       );
       Number n = list.get(0); // safe to read
    //    list.add(10); // unable to add compile time
       

    
    }
}
