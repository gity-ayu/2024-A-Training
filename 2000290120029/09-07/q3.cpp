class Solution
{
    public:
    //Function to find the smallest positive number missing from the array.
    int missingNumber(int arr[], int n) 
    { 
        // Your code here
        sort(arr,arr+n);
        int flag=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                if(flag==0 && arr[i]!=1){
                    return 1;
                }
                else if(!(i<n-1 && (arr[i+1]-arr[i]==0 || arr[i+1]-arr[i]==1))){
                    return arr[i]+1;    
                }
                flag=1;
            }
        }
        if(arr[n-1]>0)
        return arr[n-1]+1;
        return 1;
    } 
};