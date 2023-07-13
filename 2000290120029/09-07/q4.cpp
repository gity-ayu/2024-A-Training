class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.empty()) return 0;
        unordered_set<int> s(nums.begin(),nums.end());
        int j,max_len=1;
        for(int i=0;i<nums.size();i++){
            if(s.find(nums[i]-1)==s.end()){
                j=1;
                while(s.find(nums[i]+j)!=s.end()){
                    j++;
                }
                max_len=max(max_len,j);
            }
        }
        return max_len;
    }
};