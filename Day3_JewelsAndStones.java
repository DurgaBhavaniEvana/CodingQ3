class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> h1=new HashMap<>();
        for(int i=0;i<jewels.length();i++)
            h1.put(jewels.charAt(i),0);
        for(int i=0;i<stones.length();i++){
            if(h1.containsKey(stones.charAt(i))){
               h1.put(stones.charAt(i),h1.get(stones.charAt(i))+1);
            }

        }int count=0;
        for(char key:h1.keySet()){
            count+=h1.get(key);
        }
        return count;
    }
}
