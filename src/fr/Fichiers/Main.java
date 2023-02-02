package fr.Fichiers;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static char statistiqueMot() {
        // Renvoyer la lettre la plus utilisée dans le dictionnaire "liste_francais.txt"
        HashMap<Character, Integer> map = new HashMap<>();
        File file = new File("C:\\Users\\wwwli\\Desktop\\ydays\\Exos_Java\\src\\fr\\Fichiers\\liste_francais.txt");


        try {
            // Étape 1 : Lire le fichier,et afficher les mots dans le terminal
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Étape 2 : Choisir un type de liste pouvant stocker les caractères et leur nombre associé, puis remplir cette liste
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    char character = line.charAt(i);
                    if (map.containsKey(character)) {
                        int count = map.get(character);
                        map.put(character, count + 1);
                    } else {
                        map.put(character, 1);
                    }
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //étape 3 : Définir quel caractère est le plus utilisé,et le renvoyer
        char maxUse = ' ';
        int maxCount = 0;
        for (Character c : map.keySet()) {
            int count = map.get(c);
            if (count > maxCount) {
                maxUse = c;
                maxCount = count;
            }
        }
        System.out.println("la lettre la plus utilisé est '"+ maxUse +"' et elle est utilisé "+ maxCount +" fois ");
        return maxUse;
    }
}