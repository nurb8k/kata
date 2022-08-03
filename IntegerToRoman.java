public class IntegerToRoman
{
    public static String intToRoman(int num)
    {
        int[] values = { 90,50,40,10,9,5,4,1};
        String[] romanLetters = { "XC","L","XL","X","IX","V","IV","I"};
        String roman = "";
        for(int i=0;i<values.length;i++)
        {
            while(num >= values[i])
            {
                num = num - values[i];
                roman = roman + romanLetters[i];

            }
        }

        return roman;
    }



}