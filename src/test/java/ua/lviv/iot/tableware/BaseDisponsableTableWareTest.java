package ua.lviv.iot.tableware;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import ua.lviv.iot.tableware.model.DisponsableTableWare;
import ua.lviv.iot.tableware.model.Fork;
import ua.lviv.iot.tableware.model.Glass;
import ua.lviv.iot.tableware.model.MatherialType;
public abstract class BaseDisponsableTableWareTest {
        protected List<DisponsableTableWare> disponsableTableWareList;

        @BeforeEach
        public void createExerciseProgram() {
            disponsableTableWareList = new LinkedList<DisponsableTableWare>();
            disponsableTableWareList.add(new Glass("Sasha",12,34,22,MatherialType.PAPER,23,45));
            disponsableTableWareList.add(new Fork("Shvachek",132,304,212,MatherialType.WOOD,23,425));
        }

    }

