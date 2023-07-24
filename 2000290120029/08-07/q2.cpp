class Solution{
    public:
        long long pairWithMaxSum(long long arr[], long long N)
    {
        // Your code goes here
        long long int sum=0,max_sum=arr[0]+arr[1];
        for (long long int i=0;i<N-1;i++){
            sum=arr[i]+arr[i+1];
            max_sum=max(sum,max_sum);
        }
        return max_sum;
    }
};