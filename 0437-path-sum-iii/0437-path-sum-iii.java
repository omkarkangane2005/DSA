
class Solution {
    HashMap<Long , Integer > map = new HashMap<>() ;
    public int pathSum(TreeNode root, int targetSum) {
        map.put(0L ,1) ;
        return dfs(root , 0 , targetSum) ;
    }
    public int dfs(TreeNode node , long prefixSum , long targetSum){
        if(node == null ){
            return 0 ;
        }
        prefixSum += node.val ;

        int count  = map.getOrDefault(prefixSum - targetSum , 0 );
        
        map.put(prefixSum , map.getOrDefault(prefixSum , 0 ) + 1);

        count += dfs(node.left , prefixSum ,targetSum) ;
        count += dfs(node.right , prefixSum , targetSum) ;

        map.put(prefixSum , map.get(prefixSum) -1);

        return count  ;
    }
}