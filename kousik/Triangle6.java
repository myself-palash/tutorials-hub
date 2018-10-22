class Triangle6
    {
	public static void main(String[] args){
		int k,l,n=10;
		for(k=0;k<n;k++){
			for(l=n-1;l>k;l--){
				System.out.print(" ");
			}
			for(l=0;l<=k;l++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(k=0;k<n;k++){
			for(l=0;l<=k;l++){
				System.out.print(" ");
			}
			for(l=n-1;l>k;l--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
