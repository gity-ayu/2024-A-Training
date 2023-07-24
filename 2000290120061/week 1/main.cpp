
#include <iostream>
#include "node.h"
using namespace std;
void pt(Node* t){
  
    while(t!=NULL){
    cout<<t->val<<" ";
t=t->next;
}
}
Node *csize(){
    cout<<"Enter The Size of the LL"<<endl;
      int n;
   cin>>n;
   Node* head=0;
   Node* temp=0;
   while(n--){
       cout<<"Enter the data"<<endl;
       int dt;
       cin>>dt;
       Node* ls=new Node(dt);
       if(head==0){
           head=ls;
           temp=ls;
       }
       else{
           temp->next=ls;
           temp=ls;
       }
   }
   return head;
}
Node *wsize(){
    cout<<"Enter the first Number"<<endl;
    int data;
    cin>>data;
    Node* head=NULL;
    Node* temp=NULL;
    do{
    Node* t=new Node(data);
       if(head==0){
           head=t;
           temp=t;
       }
       else{
           temp->next=t;
           temp=t;
       }
    cout<<"You want to continue: Enter the number"<<".."<<" else press -1:Stop"<<endl;
        cin>>data;
    }while(data!=-1);
    
    
    
    return head;
}

Node* addsrt(Node *head){
        cout<<"Enter The dataNode to add"<<endl;
    int data;
    cin>>data;
    Node* exrt=new Node(data);
    exrt->next=head;
    head=exrt;
    return head;
}
Node* deletesrt(Node* head){
    head=head->next;
 return head;
} 

Node* addrdm(Node *head,int pos){
    cout<<"Enter The dataNode to add"<<endl;
    int data;
    cin>>data;
    Node* exrt=new Node(data);
    Node*t=head;
    int i=1;
  while(i<pos-1 ){
      t=t->next;
  }
  if(t->next->next!=NULL){
  exrt->next=t->next;
  t->next=exrt;
  }
  else {
      t->next=exrt;
  }
  
  return head;
  
}
Node* dltrdm(Node *head,int pos){
Node*t=head;
    int i=1;
  while(i<pos-1 ){
      t=t->next;
  }
  if(t->next!=NULL){
t=t->next->next;
  }
  else if(t->next->next==NULL) {
      t->next=NULL;
  }
  
  return head;
  
}

int main()
{
     cout<<"Press 1:Custome Size size LL"<<endl;
       cout<<"Press 2:without Custome size LL"<<endl;
    int n;
    cin>>n;
    Node* t1=0;
     Node *t2=0;
   
    switch(n){
        case 1:
     t1=csize();
     break;
     case 2:
     
        t2=wsize();
        break;
    }
    cout<<"Singly LL Opertions"<<endl;
  

cout<<"Press 1: Add Element in the starting"<<endl;
cout<<"Press 2: Delete Element in the starting"<<endl;
cout<<"Press 3: Add Random Postion Element in the starting"<<endl;
cout<<"Press 4: Delete Random Postion Element in the starting"<<endl;
  int x;
    cin>>x;
switch(x){
    case 1:
    if(t1!=0){
    Node* h=addsrt(t1);
    pt(h);
        
    }
    else{
           Node* h=addsrt(t2);
    pt(h); 
    }
    break;
    case 2:
        if(t1!=0){
    Node* h=deletesrt(t1);
    pt(h);
        
    }
    else{
           Node* h=deletesrt(t2);
    pt(h); 
    }
    break;
    case 3:
     cout<<"Enter Postion to Add"<<endl;
               int pos;
               cin>>pos;
           if(t1!=0){
              
    addrdm(t1,pos);
    pt(t1);
        
    }
    else{
           addrdm(t2,pos);
    pt(t2); 
    }
    break;
    case 4:
        cout<<"Enter Postion to delete"<<endl;
               int pos1;
               cin>>pos1;
               if(t1!=0){
           
    Node* h=dltrdm(t1,pos1);
    pt(h);
        
    }
    else{
           Node* h=dltrdm(t2,pos1);
    pt(h); 
    }
    break;
    
}


    return 0;
}