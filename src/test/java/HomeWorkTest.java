import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class HomeWorkTest {
    @Test
    public void test() {
//        HashMap <Character, Integer> hashMap = new HashMap();
//                hashMap.put('A', 4);
//                hashMap.put('B',2);
//                hashMap.put('C', 6);
//                hashMap.put('D', 4);

        HomeWork homeWork = new HomeWork();
        homeWork.discountСalculation("CCDDCABDDBACCCAA");
        int expected = 6;
        int countA = homeWork.getCountC();

        Assertions.assertEquals(expected,countA);
    }
}
