package com.valeriy;

public class VariableChemistryTest {
    public static void main(String[] args) {
        int helium = 2;
        int beryllium = 4;
        int oxygen;
        int sulfur;
        int germanium;

        oxygen = helium * beryllium;
        sulfur = beryllium*4;
        helium = sulfur/oxygen;
        germanium = (2*sulfur) + oxygen + beryllium + helium - (sulfur-helium);

        System.out.println("Итог расчёта =" + " " + germanium);
    }
}
