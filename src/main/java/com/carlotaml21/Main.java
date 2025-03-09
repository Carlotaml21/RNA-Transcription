package com.carlotaml21;

public class Main {
    public static void main(String[] args) {
        DnaToRnaConverter converter = new DnaToRnaConverter();
        String dnaSequence = "TGAC";
        String rnaSequence = converter.transcribe(dnaSequence);
        System.out.println("ADN: " + dnaSequence);
        System.out.println("RNA: " + rnaSequence);
    }
}
