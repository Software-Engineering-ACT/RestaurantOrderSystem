package edu.act.restaurant.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chaikal
 */
public class PlateCatalog {

    private static List<Plate> plates = new ArrayList<>();

    private PlateCatalog() {
    }

    public static void addPlate(Plate p) {
        plates.add(p);
    }

    public static List<Plate> getPlates() {
        return plates;
    }

}
