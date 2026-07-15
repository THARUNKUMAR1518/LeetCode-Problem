class Solution {
    public boolean isPalindrome(String s) {
    String m=s.toLowerCase();
    char arr[]=m.toCharArray();
    int l=arr.length;
    String temp="";
    for(int i=0;i<l;i++){
        if(arr[i]>='a' && arr[i]<='z'||arr[i]>='0' && arr[i]<='9'){
            temp+=arr[i];
        }
    }
    String n="";
    for(int i=temp.length()-1;i>=0;i--){
        n+=temp.charAt(i);
    }
    if(temp.equals(n)){
        return true;
    }
    else{
        return false;
    }
    }
}