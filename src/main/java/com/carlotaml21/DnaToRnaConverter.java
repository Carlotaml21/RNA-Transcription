package com.carlotaml21;

public class DnaToRnaConverter {

    public String transcribe(String dna){
        if (dna == null || dna.isEmpty()) {
            return "";
        }

        StringBuilder rna = new StringBuilder();
        for (char nucleotide : dna.toUpperCase().toCharArray()) {
            switch (nucleotide) {
                case 'G': rna.append('C'); break;
                case 'C': rna.append('G'); break;
                case 'T': rna.append('A'); break;
                case 'A': rna.append('U'); break;
                default:
                    throw new IllegalArgumentException("Invalid DNA nucleotide: " + nucleotide);
            }
        }
        return rna.toString();
    }
}
