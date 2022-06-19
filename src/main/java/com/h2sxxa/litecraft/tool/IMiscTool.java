package com.h2sxxa.litecraft.tool;

import java.util.Map;

public class IMiscTool {
    public static String updateKeyString(Map<String,?> Element,String Raw) {
        for(Map.Entry<String,?> entry:Element.entrySet()){
            Raw=Raw.replaceAll(entry.getKey(),entry.getValue().toString());
        }
        return Raw;
    }
    
}
