package lections.lesson12.cars;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ApplicationXml {

    public static void main(String[] args) throws JsonProcessingException {
        Wheel[] wheels = {new Wheel(), new Wheel(), new Wheel(), new Wheel()};
        List<Wheel> wheelsList = Arrays.asList(new Wheel(), new Wheel(), new Wheel(), new Wheel());
        Set<Wheel> wheelsSet = new HashSet<>(Arrays.asList(new Wheel(), new Wheel(), new Wheel(), new Wheel()));

        BMW bmw = new BMW(wheelsList);
        Mercedes mercedes = new Mercedes(wheels);
        Ford ford = new Ford(wheelsSet);

        XmlMapper mapper = new XmlMapper();
        String xml = mapper.writeValueAsString(bmw);
        System.out.println(xml);

        Mercedes mercedes1 = mapper.readValue(xml, Mercedes.class);
        System.out.println();
    }

}
