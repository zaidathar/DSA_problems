// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
vector<int> find(int arr[], int n , int x )
{
    // code here
    vector<int> res = {-1,-1};
    int ind = -1 ,flag=0;
    for(int i = 0;i<n;i++){
        if(arr[i]==x){
            if(flag==0){
                res[0]=i;
                flag=1;
                
            }
            ind=i;
        }
    }
    if(ind!=-1)res[1]=ind;
    return res;
}

// { Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,x;
        cin>>n>>x;
        int arr[n],i;
        for(i=0;i<n;i++)
        cin>>arr[i];
        vector<int> ans;
        ans=find(arr,n,x);
        cout<<ans[0]<<" "<<ans[1]<<endl;
    }
    return 0;
}


  // } Driver Code Ends