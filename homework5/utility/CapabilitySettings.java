package homework5.utility;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CapabilitySettings {

    private static final ObjectMapper mapper = new ObjectMapper();
    private static final DesiredCapabilities capabilities = new DesiredCapabilities();
    private static Map<String,String> capsAsMap;

    public CapabilitySettings(){

    }

    //Bu metot ile json dosyalarından aldığımız capabilityleri driver da kullanılabilecek hale getiriyoruz.
    public static DesiredCapabilities getDesiredCapsFromJson(String jsonPath){
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader(jsonPath));  //Buffered reader ile json dosylarını okutuyoruz.
            capsAsMap = mapper.readValue(reader, HashMap.class);    //ObjectMapper kullanarak okuduğumuz dosyaları hash map e koyuyoruz.
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        for(String capName : capsAsMap.keySet()){
            capabilities.setCapability(capName,capsAsMap.get(capName)); //hash map içindeki değerleri de bu şekilde capabilities e yerleştiriyoruz.
        }

        return capabilities;
    }


    public static void changeCaps(String capToChange,String valueOfNewCap){ //capability değiştirir.
        capsAsMap.replace(capToChange,valueOfNewCap);
        capabilities.setCapability(capToChange,capsAsMap.get(capToChange));
    }

}
