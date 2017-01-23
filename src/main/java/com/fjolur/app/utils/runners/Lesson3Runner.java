package com.fjolur.app.utils.runners;

import com.fjolur.app.utils.convertors.PrimitiveConvertor;

public class Lesson3Runner {
    public static void main(String[] args) {
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        primitiveConvertor.charToInt('\u00A9');
        primitiveConvertor.floatToChar(72.0f);
        primitiveConvertor.intToChar(74);
    }
}
