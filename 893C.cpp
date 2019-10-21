#include<bits/stdc++.h>
#define fast ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
using namespace std;
//long mini=INT_MAX;
    vector<int>adj[100002];
    bool visited[100002];
        long arr[100002];
    long bfs(int i){
            queue<int>q;
             long mini=INT_MAX;
            q.push(i);
            visited[i]=true;

            while(!q.empty()){
                int u=q.front();
                q.pop();
                mini=min(mini,arr[u]);

                for(int j=0;j<adj[u].size();j++){
                    if(visited[adj[u][j]]==false){
                        q.push(adj[u][j]);
                        visited[adj[u][j]]=true;
                    }
                }

    }
    return mini;

    }


int main() {


    int nodes,edges;
    cin>>nodes>>edges;



    for(int i=0;i<nodes;i++){
        cin>>arr[i];
    }


   // memset(visited,false,sizeof visited);
    int from,to;
    for(int i=0;i<edges;i++){
        cin>>from>>to;
        from--,to--;
        adj[from].push_back(to);
        adj[to].push_back(from);
    }

    //long mini;
    long long ans=0;
    long long add;
    for(int i=0;i<nodes;i++){

        if(visited[i]==false){
                add=bfs(i);
             //   cout<<add<<" "<<endl;
                ans+=add;
            }


        }




    cout<<ans;




	return 0;
}


/*
ll  modularExponentiation(ll x,ll n,ll M)
{

    ll result=1;

    while(n>0)
    {

	if(n%2==1)

 result=(result*x)%M;

  x=(x*x)%M;

  n=n/2;

}

  return result;
}



*/


