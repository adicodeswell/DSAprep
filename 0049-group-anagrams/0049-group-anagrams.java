class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            char[] chars = word.toCharArray();

            Arrays.sort(chars);

            String signature = new String(chars);

            if (!map.containsKey(signature)) {
                map.put(signature, new ArrayList<>());
            }

            map.get(signature).add(word);

        }

        return new ArrayList<>(map.values());

    }
}