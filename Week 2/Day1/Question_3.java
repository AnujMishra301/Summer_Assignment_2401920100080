class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int []rans=new int[26];
        for(char ch:magazine.toCharArray()){
            rans[ch-'a']++;
        }
        for(char ch:ransomNote.toCharArray()){
            rans[ch-'a']--;
        }
        for(int count:rans){
            if(count<0){
                return false;
            }
        }
        return true;
    }
}