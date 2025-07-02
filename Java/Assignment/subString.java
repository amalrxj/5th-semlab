class subString{
	public static void main(String arg[]){
		String str1="Good";
		String str2=" Morning";
		String concat = str1 + str2;
		System.out.println("Concatenation: "+concat);
		System.out.println("Length: "+str1.length());
		System.out.println("Lowercase: "+str2.toLowerCase());
		System.out.println("Uppercase: "+str1.toUpperCase());
		System.out.println("Replace: "+str1.replace('d','o'));
		System.out.println("Substring: "+str2.substring(3));
	}
}                         
