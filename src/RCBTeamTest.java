import POJO.RCBTeam;
import org.testng.annotations.Test;

public class RCBTeamTest {

    RCBTeam rcbTeam = TeamMapper.getMapperObject();
    @Test
    public void validateForeignPlayersInTeam(){

        System.out.println(rcbTeam.getName());



    }
    @Test
    public void validateWicketKeeperInTeam(){




    }
}