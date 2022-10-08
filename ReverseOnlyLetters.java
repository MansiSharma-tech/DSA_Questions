import java.lang.*;
class ReverseOnlyLetters
{
    public String reverseOnlyLetters(String s) 
    {
        char[] arr = s.toCharArray();
        int i = 0, j = s.length() - 1;
        boolean b1, b2;
        
        while(i<=j)
        {
            b1 = Character.isLetter(arr[i]);
            b2 = Character.isLetter(arr[j]);
            
            //if both are letters
            if(b1 && b2)
            {
                swap(arr, i , j);
                i++;
                j--;
            }

            else if(b1 == true)
            {
                j--;
            }
            else if(b2 == true)
            {
                i++;
            }
            else
            {
                i++;
                j--;
            }
        }
        
        return String.valueOf(arr);
        
    }
    
    public void swap(char[] arr, int low, int high)
    {
        char temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
}