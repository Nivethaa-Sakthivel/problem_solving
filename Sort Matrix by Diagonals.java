class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int key=i-j;
                map.computeIfAbsent(key,k ->new ArrayList<>()).add(grid[i][j]);
            }
        }
        for(int key:map.keySet()){
            List<Integer> list=map.get(key);
            if(key>=0){
                list.sort(Collections.reverseOrder());
            }else{
                Collections.sort(list);
            }
        }
        Map<Integer, Integer>indexMap = new HashMap<>();
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int key=i-j;
                int idx=indexMap.getOrDefault(key,0);
                grid[i][j]=map.get(key).get(idx);
                indexMap.put(key,idx+1);
            }
         }
         return grid;
    }
}
