class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        int n=nums.size();
        vector<int> arr(n);
        int i=0,j=1;
        for(int k=0;k<n;k++){
            if(nums[k]>=0){
                arr[i]=nums[k];
                i+=2;
            }else{
                arr[j]=nums[k];
                j+=2;
            }
        }
        return arr;
    }
};