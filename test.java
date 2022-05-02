public String frequencySort(String s) {
        int[] arr = new int[26];
        for(char c : s){
            arr[c - 'a']++;
        }
}
