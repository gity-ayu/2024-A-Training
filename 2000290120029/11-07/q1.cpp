int findK(int a[MAX][MAX],int n,int m,int k)
    {
 		// Your code goes here.
 		int rs=0,re=n-1,cs=0,ce=m-1;
 		int count=0,d=1;
 		while(rs<=re && cs<=ce){
 		    d=d%4;
 		    if(d==1){
 		        for(int j=cs;j<=ce;j++){
 		            count++;
 		            if(count==k){
 		                return a[rs][j];
 		            }
 		        }
 		        rs++;
 		    }else if(d==2){
 		        for(int i=rs;i<=re;i++){
 		            count++;
 		            if(count==k){
 		                return a[i][ce];
 		            }
 		        }
 		        ce--;
 		    }else if(d==3){
 		        for(int j=ce;j>=cs;j--){
 		            count++;
 		            if(count==k){
 		                return a[re][j];
 		            }
 		        }
 		        re--;
 		    }else if(d==0){
 		        for(int i=re;i>=rs;i--){
 		            count++;
 		            if(count==k){
 		                return a[i][cs];
 		            }
 		        }
 		        cs++;
 		    }
 		    d++;
 		}
 		return 0;
 		
    }