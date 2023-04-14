class Recur8{
	public static void main(String args[]){
		String s = "abcd";
		printrecur(s,s.length()-1);
		// StringBuilder sb = new StringBuilder(s);
		// sb.reverse();
		// System.out.println(sb);
	}
	public static void printrecur(String s,int indx){
		if(indx==0){
			System.out.print(s.charAt(indx));
		return;
		}
		System.out.print(s.charAt(indx));
		printrecur(s,indx-1);
	}
}