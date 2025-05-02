package dataDrivenHandling;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class jsonDataReader {

    public static productDetails getProductDetails() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        productDetails product = mapper.readValue(new File("testDataFiles/testData.json"), productDetails.class);
        return product;
    }
}
