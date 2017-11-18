package com;
class Test {
	public static void main(String args[]) {
		String no = "12345";
		reverse(no);
	}
	public static void reverse(String no){
		char arr[] = no.toCharArray();
		int j = no.length()-1;
		for(int i = 0;i < j; i++){
			char tem = arr[i];
			arr[i] = arr[j];
			arr[j] = tem;
			 j--;
		}
		for(int i = 0;i < 5; i++){
			System.out.println(arr[i]);
		}
	}	
}