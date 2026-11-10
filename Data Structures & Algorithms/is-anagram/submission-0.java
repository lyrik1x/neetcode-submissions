class Solution {
    public boolean isAnagram(String s, String t) {

if (s.length() != t.length()) { return false;}


        HashMap<Character, Integer> mapaa = new HashMap<>();
        HashMap<Character, Integer> mapa = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            mapa.put(s.charAt(i), mapa.getOrDefault(s.charAt(i), 0) + 1);
            mapaa.put(t.charAt(i), mapaa.getOrDefault(t.charAt(i), 0) + 1);

        }

        
 return (mapa.equals(mapaa));

    }
}
