import java.util.*;

public class GemstonesSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        =
        int n = scanner.nextInt();
        scanner.nextLine();
        
        List<String> rocks = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String rock = scanner.nextLine();
            rocks.add(rock);
        }
        
        int result = gemstones(rocks);
        System.out.println(result);

        scanner.close();
    }

    public static int gemstones(List<String> arr) {
        int countGemstones = 0;
        HashMap<Character, Integer> frequencyHashmap = new HashMap<>();

        for(int i = 0; i < arr.size(); i++) {
            String currentString = arr.get(i);
            HashSet<Character> uniqueChars = new HashSet<>();

            for(int j = 0; j < currentString.length(); j++) {
                char currentChar = currentString.charAt(j);
                uniqueChars.add(currentChar);
            }

            for(char c : uniqueChars) {
                frequencyHashmap.put(c, frequencyHashmap.getOrDefault(c, 0) + 1);
            }
        }

        int totalRocks = arr.size();

        for(char key : frequencyHashmap.keySet()) {
            if(frequencyHashmap.get(key) == totalRocks) {
                countGemstones++;
            }
        }

        return countGemstones;
    }
}
