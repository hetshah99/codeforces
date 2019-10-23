#include<bits/stdc++.h>
#define fast ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
using namespace std;
//https://codeforces.com/contest/1230/problem/D


int main() {

    fast
    int n;
    cin>>n;

    vector<long long >a(n);
    vector<long long >b(n);
    vector<bool>ok(n,false);

    for(int i=0;i<n;i++)cin>>a[i];
    for(int i=0;i<n;i++)cin>>b[i];

    for(long long i:a){

        int cnt=0;

        for(int j=0;j<n;j++){
            if(i==a[j])cnt++;
        }

        if(cnt>=2){

                for(int j=0;j<n;j++){
                    if((i&a[j])==a[j])
                       ok[j]=true;
                }


        }

    }

    long long sum=0;
    for(int i=0;i<n;i++)if(ok[i])sum+=b[i];
    cout<<sum;


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


