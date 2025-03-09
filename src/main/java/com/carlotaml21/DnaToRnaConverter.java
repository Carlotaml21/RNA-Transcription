package com.carlotaml21;

public class DnaToRnaConverter {

    public String transcribe(String dna){
        StringBuilder rna = new StringBuilder();
        for (char nucleotide : dna.toCharArray()) {
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
