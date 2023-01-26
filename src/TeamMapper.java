import POJO.RCBTeam;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class TeamMapper {
    public static RCBTeam getMapperObject() {
        ObjectMapper mapper = new ObjectMapper();
        {
            try {
                return mapper.readValue(new File("src/TeamRCB.json"), RCBTeam.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
