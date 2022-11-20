package com.hz;

import java.util.Arrays;
import java.util.List;

public class ReadBooleanAdapter implements BooleanService {
    private ConsoleReader text;
    private List<String> truthValues;

    public ReadBooleanAdapter(ConsoleReader text) {
        this.text = text;

        String[] trueValues =new String[] {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
        this.truthValues = Arrays.asList(trueValues);
    }

    @Override
    public boolean readLineBoolean() {
        String Line = this.text.readLine();
        return this.truthValues.contains(Line);
    }
}