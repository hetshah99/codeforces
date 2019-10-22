#include<bits/stdc++.h>
#define fast ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
#define ll long long
//https://codeforces.com/contest/1195/problem/D1
using namespace std;
ll  modularExponentiation(ll x,ll n,ll M);

int main() {
    fast
    int n;
    cin>>n;

    long M= 998244353;
    int a[10];

    long *arr =new long [n];
    long long  ans=0;

    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    long temp=arr[0];
    int nsize=0;

    while(temp>0)
    {
            temp=temp/10;
            nsize++;
    }
    for(int i=0;i<n;i++){
    for(int j=1;j<=nsize;j++)
    {
        a[j]=arr[i]%10;
        arr[i]/=10;
    }

    for(int j=1;j<=nsize;j++){
        ans=ans+(n*((a[j]%M* modularExponentiation(10,2*j-1,M))%M)+n*((a[j]%M* modularExponentiation(10,2*j-2,M))%M))%M;
    }



    }


    cout<<ans%M;








	return 0;
}



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






