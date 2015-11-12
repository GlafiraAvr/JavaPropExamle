import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by Glafira on 12.11.2015.
 */
public class Props {
  static  final String PATH = "C:\\Users\\Glafira\\IdeaProjects\\maavenProperties\\src\\main\\resources\\config.properties";
    public static void main(String[] args) throws FileNotFoundException {

        Properties prop = new Properties();
        FileInputStream  fIo = new FileInputStream(PATH);
        ArrayList<String> propNames = new ArrayList<String>();
        try {
            prop.load(fIo);
            int i;
            Enumeration<?> en = prop.propertyNames();

           while (en.hasMoreElements()) {

                propNames.add((String) en.nextElement());

            }
           String site = prop.getProperty("site");
           String password = prop.getProperty("password");
           System.out.println(propNames);
           System.out.format("site = %s",site);
            System.out.format("password = %s",password);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
