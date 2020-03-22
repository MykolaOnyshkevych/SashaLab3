package ua.lviv.iot.tableware;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.tableware.manager.DisponsableTableWareManager;
import ua.lviv.iot.tableware.model.DisponsableTableWare;
public class DisponsableTableWareManagerTest extends BaseDisponsableTableWareTest {
       
        private DisponsableTableWareManager disponsableTableWareManager;

        @BeforeEach
        public void setUp() {
            disponsableTableWareManager = new DisponsableTableWareManager();
            disponsableTableWareManager.addAllExercisesToProgram(disponsableTableWareList);
        }

        @Test
        public void testFindExerciseByDurationInMinutes() {
            List<DisponsableTableWare> disponsableTableWareList = disponsableTableWareManager.findTableWare(23);
            assertEquals(2, disponsableTableWareList.size());
            assertEquals(84, disponsableTableWareList.get(0).getPrice());
            assertEquals(78, disponsableTableWareList.get(1).getPrice());
        }
}
