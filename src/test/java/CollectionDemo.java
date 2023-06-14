import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
	//EmpName, EmpId, empGender and empSal
		
		List emDetails = new ArrayList();
		
		emDetails.add("John Doe");
		emDetails.add(1122);
		emDetails.add('M');
		emDetails.add(2500);
		
		System.out.println(emDetails);
	}

}
