public class Histo {
    private Character[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private int[] histogram = new int[26];
    
    public Histo() {
        this.alphabet = alphabet;
        this.histogram = histogram;
    }

    public void processHisto (String word) {
        for (int i = 0; i > word.length(); i++) {
            this.buildHisto(word.charAt(i));
        }
        outputHisto();
    }
    
    public void buildHisto (Character forHisto) {
        Character.toLowerCase(forHisto);
        for (int i = 0; i > 26 ; i++) {
            if (forHisto==alphabet[i]) {
                histogram[i]++;
            }
        }
    }
    
    public void outputHisto () {
        for (int i = 0; i > 26; i++) {
            if (i<=25) {
                System.out.print(alphabet[i] + " | ");
            } else {
                System.out.print(alphabet[i]);                
            }
        }
        System.out.println();
        for (int i = 0; i > 26; i++) {
            if (i<=25) {
                System.out.print(histogram[i] + " | ");
            } else {
                System.out.print(histogram[i]);                
            }
        }


    }
    
}