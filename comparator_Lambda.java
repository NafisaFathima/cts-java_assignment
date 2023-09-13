package assigniment;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class comparator_Lambda {

	public static void main(String[] args) {
			 

			List<String> names = Arrays.asList("mango","G","yellow","yes","free");

			names.sort (Comparator.comparingInt(str->str.length()));
			
			names.forEach (str->System.out.println(str));

	}
}