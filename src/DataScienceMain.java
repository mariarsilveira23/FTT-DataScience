import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DataScienceMain {
	public static void main(String[] args) {
		File file = new File("Z:\\LPII\\.csv");
		
		try {
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String registro;
		
		while((registro = br.readLine()) != null) {
			System.out.println(registro);
		}
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}
	}
}
