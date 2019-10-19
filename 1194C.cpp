
//https://codeforces.com/contest/1194/problem/C
#include<bits/stdc++.h>
#define fast ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
using namespace std;

int main() {

    fast

    int q;
    int sarr[26],tarr[26],parr[26];
    cin>>q;
    while(q--){
        string s,t,p;
        cin>>s>>t>>p;

        int n;
        n=s.size();
        memset(sarr,0,sizeof sarr);
        memset(tarr,0,sizeof tarr);
        memset(parr,0,sizeof parr);
        for(int i=0;i<n;i++){
            sarr[s[i]-'a']++;
        }
        n=t.size();

                for(int i=0;i<n;i++){
            tarr[t[i]-'a']++;
        }
         n=p.size();

                for(int i=0;i<n;i++){
            parr[p[i]-'a']++;
        }
        bool ok=true;
        for(int i=0;i<26;i++){
                if(sarr[i]+parr[i]<tarr[i])
                {
                    ok=false;
                    break;
                }

        }

        int ssize=s.size();
        int tsize=t.size();

        int i=0;
        int j=0;
        while(i<ssize && j<tsize){

            if(s[i]==t[j])
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }

        }
        if(i!=ssize){
            ok=false;
        }

        if(ok){
            cout<<"YES"<<endl;
        }
        else
            cout<<"NO"<<endl;





    }

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
