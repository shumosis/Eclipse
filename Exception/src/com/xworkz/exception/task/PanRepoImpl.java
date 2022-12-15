package com.xworkz.exception.task;

import com.xworkz.exception.customCreaExce.PanSizeExceededException;

public class PanRepoImpl implements PanCardRepo {
	private String[] panCards = new String[10];
	private int panCardIndex = 0;

	@Override
	public boolean linking(String card) {
		System.out.println("running the linking");
		if (this.panCardIndex > panCards.length) {
			throw new PanSizeExceededException();
		}
		this.panCards[panCardIndex] = card;
		panCardIndex++;
		return false;
	}

	public int total() {
		return PanCardRepo.super.total();

	}

}
