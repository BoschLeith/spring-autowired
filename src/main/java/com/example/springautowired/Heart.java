package com.example.springautowired;

public class Heart {

	private String typeOfHeart;
	private int numOfHeart;

	public String getTypeOfHeart() {
		return typeOfHeart;
	}

	public void setTypeOfHeart(String typeOfHeart) {
		this.typeOfHeart = typeOfHeart;
	}

	public int getNumOfHeart() {
		return numOfHeart;
	}

	public void setNumOfHeart(int numOfHeart) {
		this.numOfHeart = numOfHeart;
	}

	public void pump(){
		System.out.println("Your heart is pumping");
		System.out.println("Alive");
	}

}
