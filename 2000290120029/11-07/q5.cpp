class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int n=nums.size();
        int count=0,sum=0;
        unordered_map<int,int> um;
        um[0]=1;

        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(um.find(sum-k)!=um.end()){
                count+=um[sum-k];
            }
            um[sum]++;
        }
        return count;
    }
};