import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streamer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ArrayList<String> names = new ArrayList();
          names.add("Bean");
          names.add("Chotta");
          names.add("Indhumathi");
          names.add("Chukki");
          names.add("raju");
         List<String> name =  names.stream().filter(s->s.endsWith("i")).sorted().collect(Collectors.toList());
         System.out.println(name);
          }
          
	}


