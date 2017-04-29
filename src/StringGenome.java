/**
 * Created by Pruthvi on 4/28/2017.
 */

/**
 * Solution to Exercise 3-3-20 Genome problem
 * One instance variable used
 * API:
 * void addNucleotide(char s)             ---     add the nucleotide
 * char nucleotideAt(int n)               ---     get the nucleotide at the position x
 * boolean isPotentialGene(String s)        ---     check if the string is a potential gene
 *
 */
public class StringGenome {
    //Instance variables
    private String genome;
    //Constructor
    public  StringGenome(){
        genome = "";
    }

    private void addCodon(char c){
        genome = genome+c;
    }

    //Instance Methods
    public void addNucleotide(char c){
        if (c == 'A' || c == 'C' || c == 'G' || c == 'T') addCodon(c);
        else throw new RuntimeException(" Wrong nucleotide, check for entry.");
    }

    public char nucleotideAt(int i){
        if (i < genome.length()) return genome.charAt(i);
        else throw new RuntimeException("Not in the genome bounds");
    }

    public int length(){
        return genome.length();
    }

    //unit test each of the methods
    public static void main(String [] args){
        StringGenome genome = new StringGenome();
        genome.addNucleotide('A');
        genome.addNucleotide('G');
        genome.addNucleotide('C');
        genome.addNucleotide('C');
        genome.addNucleotide('T');
        for (int i = 0; i < genome.length(); i++) {
            StdOut.print(genome.nucleotideAt(i));
        }
        StdOut.println();
    }
}
