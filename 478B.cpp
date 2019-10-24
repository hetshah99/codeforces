//https://codeforces.com/problemset/problem/478/B
#include<bits/stdc++.h>
using namespace std;

long long ans(long n)
{

    long long ansi=0;
    ansi=((long long) (n)*(long long )(n-1))/(long long )2;
    return ansi;


}

int main()
{
    long m,n;
    cin>>n>>m;

    long long maxi=ans(n-m+1);
    long long mini=(n%m)*ans((long)ceil(n*1.0/m ))+(m-n%m)*ans(n/m);
    cout<<mini<<" "<<maxi;


    return 0;
}
