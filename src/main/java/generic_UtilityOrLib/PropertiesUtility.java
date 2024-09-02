package generic_UtilityOrLib;
import java.io.FileInputStream;
import java.util.Properties;



public class PropertiesUtility {

		
		public  String getDataFromProperties(String data) throws Exception {
			
			FileInputStream fir=new FileInputStream(IconstantUtility.propertiespath);
			Properties pobj =new Properties();
			pobj.load(fir);
			
			String value =pobj.getProperty(data);
			return value;
			
		}
		
	}

