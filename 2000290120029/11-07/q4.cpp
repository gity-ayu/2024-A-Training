class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int rs=0,re=matrix.size()-1,cs=0,ce=matrix[0].size()-1;
        int d=1;
        vector<int> ans;
        while(rs<=re && cs<=ce){
            d=d%4;
            if(d==1){
                for(int j=cs;j<=ce;j++){
                    ans.push_back(matrix[rs][j]);
                }
                rs++;
            }else if(d==2){
                for(int i=rs;i<=re;i++){
                    ans.push_back(matrix[i][ce]);
                }
                ce--;
            }else if(d==3){
                for(int j=ce;j>=cs;j--){
                    ans.push_back(matrix[re][j]);
                }
                re--;
            }else if(d==0){
                for(int i=re;i>=rs;i--){
                    ans.push_back(matrix[i][cs]);
                }
                cs++;
            }
            d++;
        }
        return ans;
    }
};