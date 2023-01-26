import POJO.RCBTeam;
import org.testng.annotations.Test;
import static org.junit.Assert.*;

public class RCBTeamTest {

    RCBTeam rcbTeam = TeamMapper.getMapperObject();
    @Test
    public void validateFourForeignPlayersInTeam(){
        int countOfForeignPlayers=0;
        for(int i=0;i<rcbTeam.getPlayer().size();i++) {
            if(!rcbTeam.getPlayer().get(i).getCountry().equalsIgnoreCase("India")) {
                countOfForeignPlayers++;
            }
        }
        assertEquals(4,countOfForeignPlayers);
    }
    @Test
    public void validateAtLeastOneWicketKeeperInTeam(){
        int countOfWicketKeeper=0;
        for(int i=0;i<rcbTeam.getPlayer().size();i++) {
            if(rcbTeam.getPlayer().get(i).getRole().equalsIgnoreCase("Wicket-keeper")) {
                countOfWicketKeeper++;
            }
        }
        assertTrue(countOfWicketKeeper>=1);
    }

}
