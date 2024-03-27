package ejerciciosInsti.Hoteles;

import java.util.Comparator;

public class CompararIdHotel implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Hotel h1 = (Hotel) o1;
        Hotel h2 = (Hotel) o2;
        if (h1.getIdHotel() < h2.getIdHotel()){
            return -1;
        } else if (h1.getIdHotel() > h2.getIdHotel()) {
            return 1;
        } else {
            return 0;
        }
    }
}
