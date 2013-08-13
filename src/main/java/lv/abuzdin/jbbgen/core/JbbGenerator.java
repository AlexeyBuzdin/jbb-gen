package lv.abuzdin.jbbgen.core;

import lv.abuzdin.jbbgen.BuilderPreferences;
import lv.abuzdin.jbbgen.Pair;

import java.util.List;

public class JbbGenerator {

    public void generate(BuilderPreferences pref){

        String classSource = loadClassSourceFromFile(pref.getClassPath());

        List<Pair<String, String>> fields =  extractFieldsAndItsTypes(classSource);

        String builderSource = generateBuilderSource(fields);

        saveBuilderSourceToFile(builderSource, pref.getDestination());
    }

    String loadClassSourceFromFile(String classPath) {
        return null;
    }


    List<Pair<String, String>> extractFieldsAndItsTypes(String classSource) {
        return null;
    }

    String generateBuilderSource(List<Pair<String, String>> fields) {
        return null;
    }

    void saveBuilderSourceToFile(String builderSource, String destination) {


    }

}
