package space.eliseev.iplatformmoex.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import space.eliseev.iplatformmoex.model.entity.*;

import java.io.IOException;
import java.net.URL;

@Service
@Getter
@Setter
public class JsonFetchingService {
    private JsonEntity jsonEntity;

    public JsonFetchingService() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            jsonEntity = mapper.readValue(new URL("https://iss.moex.com/iss/index.json"), JsonEntity.class);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
