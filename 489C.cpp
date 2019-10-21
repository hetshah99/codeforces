//https://codeforces.com/contest/489/problem/C
//Nice Implementation
#include<bits/stdc++.h>
using namespace std;

int main()

{ int m,s;
    cin>>m>>s;

    if(s==0 || s>9*m)
    {
        if(s==0 && m==1)
            cout<<"0 0";
        else
         cout<<"-1 -1";
         return 0;
    }

    int left=s;
    int *arr=new int [m];
    for(int i=0;i<m;i++)
    {
        if(left>=9)
        {
            left-=9;
            arr[i]=9;
        }
        else if(left>=8)
        {
            left-=8;
            arr[i]=8;
        }

        else if(left>=7)
        {
            left-=7;
            arr[i]=7;
        }
       else if(left>=6)
        {
            left-=6;
            arr[i]=6;
        }
       else if(left>=5)
        {
            left-=5;
            arr[i]=5;
        }
        else if(left>=4)
        {
            left-=4;
            arr[i]=4;
        }
       else if(left>=3)
        {
            left-=3;
            arr[i]=3;
        }
       else if(left>=2)
        {
            left-=2;
            arr[i]=2;
        }
       else if(left>=1)
        {
            left-=1;
            arr[i]=1;
        }
        else if(left==0)
        {
            left-=0;
            arr[i]=0;
        }
        else
        {
            cout<<"-1 -1";
            return 0;
        }

    }


    if(arr[m-1]!=0){
        for(int i=m-1;i>=0;i--)
        cout<<arr[i];

        cout<<" ";

            for(int i=0;i<m;i++)
        cout<<arr[i];
    }
    else
    {   bool flag=true;
        cout<<1;
            for(int i=m-2;i>=0;i--)
        {
            if(arr[i]==0)
                cout<<0;
            else if(flag)
            {
                cout<<arr[i]-1;
                flag=false;
            }
            else
                cout<<arr[i];

        }

        cout<<" ";

                          for(int i=0;i<m;i++)
        cout<<arr[i];
    }


    return 0;
}
