package practise;

public class RemoveArrayDupicate {

	public static void main(String[] args) {
		
		int[] a = {1,1,2,2,3};
		/*int l=a.length;
		int b = 0;
        a[b] = a[0];
        for (int i = 1; i < l; i++)
        {
            if (a[b] != a[i])
            {
                b++;
                a[b]=a[i];

            }

        }
        for(int i=0;i<=b;i++)
        {
            System.out.println(a[i]);
        }*/

		
		for(int i=0; i<a.length; i++)
		{
			for (int j = 0; j >i; j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
					
				}
			}
		}
	}

}
