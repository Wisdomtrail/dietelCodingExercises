package chapterSixteen;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapSample {
    public static void main(String[] args) {
        Map<String, String[]> nigerianStates = new HashMap<>();
        nigerianStates.put("zamfara", new String[]{"Akure", "Gusau"});
        nigerianStates.put("sokoto", new String[]{"sokoto", "Gusau"});
        nigerianStates.put("Taraba", new String[]{"Gembu", "Jalingo", "Municipal"});
        nigerianStates.put("akwa-ibom", new String[]{"ikot-ekpene", "ikono"});

        var value = nigerianStates.get("zamfara");
        System.out.println(Arrays.toString(value));

        nigerianStates.forEach((k, v) -> System.out.println(k + " " + Arrays.toString(v)));


    }
}
