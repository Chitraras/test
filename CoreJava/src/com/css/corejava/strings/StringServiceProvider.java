package com.css.corejava.strings;
public class StringServiceProvider {

	public static void main(String[] args) {
		  String string="Chitrarasu";
		    char key='a';
		       int k;
			int i=0;
			int len=0;
	       char searchElement='a';
	       char replaceElement='A';
	
		   
			try {
				while(true) {
					if(string.charAt(i)!='\0') 
						len++;
						i++;		
				}
			}
				
			catch(Exception e)
			{
			
				System.out.println("Length of the String:"+len);
			}
			System.out.println("Reversed String:");
			for(int j=len-1;j>=0;j--) {
				
				System.out.print(string.charAt(j));
				
				
		}
			System.out.println("");
			int count=0;
			for(k=0;k<len-1;k++) {
				if(string.charAt(k)==key)
				{
					System.out.println("Searched Element:");
					System.out.println("The searching word "+key+" found at the index of "+k);
					count++;
				}
			}
			 if(count==0) {
					System.out.println("The given word is not found");
				
			}
			 StringServiceProvider s= new StringServiceProvider();
			 String replaced = s.replaced(string,searchElement,replaceElement);
				System.out.println("After Replaced : "+replaced);
			     
		}
		public String replaced(String name,char searchElement,char replaceElement) {
			int len=6;
			char[] arr=name.toCharArray();
			for(int i=0;i<len;i++) {
				if(arr[i]==searchElement)
				{
					arr[i]=replaceElement;
				}
			}
			String replaced=new String(arr);
			return replaced;
		}
		
	}

	    