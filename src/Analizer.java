public class Analizer {
    private String text = "Ja chC1 D0Mu. 367 + 5 je 8.";

    public void anal(){
        int pocetPismen = 0;
        int pocetVelkych = 0;
        int pocetMalich = 0;
        int pocetCisel = 0;
        int pocetSlov = 1;
        int pocetVet = 0;
        for (int j=0;j<text.length()-1;j++){
            char ch = text.charAt(j);

            if (Character.isDigit(ch)){
                pocetCisel++;
            } else if (Character.isAlphabetic(ch)) {
                pocetPismen++;
                if (Character.isUpperCase(ch)){
                    pocetVelkych++;
                }
                else if (Character.isLowerCase(ch)){
                    pocetMalich++;
                }

            }



        }
        int cislo = 0;
        while (true){
            if (text.indexOf(".", cislo) != -1 || text.indexOf("!", cislo) != -1 ||  text.indexOf("?", cislo) != -1){


                if (text.indexOf(".", cislo) != 0) {
                    cislo = text.indexOf(".", cislo)+1;
                    pocetVet++;
                }
                else if (text.indexOf("!", cislo) != 0) {
                    cislo = text.indexOf("!", cislo)+1;
                    pocetVet++;
                }
                else if (text.indexOf("?", cislo) != 0) {
                    cislo = text.indexOf("?", cislo)+1;
                    pocetVet++;
                }
            }
            else{
                break;
            }
        }

        int cislo2 = 0;
        while (true){
            if (text.indexOf(" ", cislo2) != -1){
                if (text.indexOf(" ", cislo2) != 0) {
                    cislo = text.indexOf(" ", cislo2)+1;
                    pocetSlov++;
                }
            }
            else{
                break;
            }
        }

        System.out.println("Počet písmen: " + pocetPismen);
        System.out.println("Počet Velkých písmen: " + pocetVelkych + ", počet malých: " + pocetMalich);
        System.out.println("Počet číslic: " + pocetCisel);
        System.out.println("Počet slov: " + pocetSlov);
        System.out.println("Počet vět: " + pocetVet);
    }
}
