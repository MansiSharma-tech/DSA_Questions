class PlusOne {
    public int[] plusOne(int[] digits) {
        
        int size =digits.length;
        
        for(int i=size-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]+=1;
                break;
            }
            else{
                digits[i]=0;
            
            }
        }
        if(digits[0]==0)
        {
        int[] newArr=new int[size+1];
        newArr[0]=1; 
            return newArr;
        }
             
    return digits;
    }
}
