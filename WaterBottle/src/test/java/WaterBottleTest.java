import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;
    @Before
    public void before() {waterbottle = new WaterBottle(100); }

    @Test
    public void hasVolume() {
        assertEquals(100, waterbottle.getVolume() );
    }

    @Test
    public void drinkingReducesVolumeBy10() {
        waterbottle.drink();
        assertEquals(90, waterbottle.getVolume() );
    }

    @Test
    public void waterbottleCanBeEmptied() {
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume() );
    }

    @Test
    public void waterbottleCanBeFilled() {
        waterbottle.empty();
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume() );
    }
}
