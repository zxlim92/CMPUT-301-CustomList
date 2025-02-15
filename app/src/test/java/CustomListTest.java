import static org.junit.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());

    }
    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax","NS"));
        assertEquals(list.getCount(),listSize+1);

    }
    @Test
    public void hasCityTest(){
        City city = new City("Halifax", "NS");
        list.addCity(city);

        assertEquals(true, list.hasCity(city));

    }
    @Test
    public void testDelete() {

        City city = new City("Halifax", "NS");
        list.addCity(city);
        assertEquals(true, list.hasCity(city));
        list.delete(city);
        assertEquals(false, list.hasCity(city));

    }
    @Test
    public void testCountCities() {


        City city = new City("Halifax", "NS");
        list.addCity(city);

        assertEquals(1, list.countCities());

    }

}
