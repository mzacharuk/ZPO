import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class MainTest {

    @Test
    public void compareTwoStringSplitterTest(){
        String sToCompare1 = "1234567890";
        String sToCompare2 = "123456789";

        List<String> splittedString = Main.stringSplitter(sToCompare1, 3);
        List<String> splittedString2 = Lists.newArrayList(Splitter.fixedLength(3).split(sToCompare2));

        assertArrayEquals("results of method stringSplitter is not equal to gson splitter",splittedString.toArray(), splittedString2.toArray());
    }

}
