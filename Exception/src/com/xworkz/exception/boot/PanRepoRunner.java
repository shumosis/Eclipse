package com.xworkz.exception.boot;

import com.xworkz.exception.task.PanCardRepo;
import com.xworkz.exception.task.PanRepoImpl;

public class PanRepoRunner {

	public static void main(String[] args) {
		PanCardRepo cardRepository=new PanRepoImpl();
		cardRepository.linking("bwxpg5808e");
		cardRepository.linking("bwxpg5808e");
		cardRepository.linking("bwxpg5808e");
		cardRepository.linking("bwxpg5808e");
		cardRepository.linking("bwxpg5808e");
		cardRepository.linking("bwxpg5808e");
		cardRepository.linking("bwxpg5808e");
		cardRepository.linking("bwxpg5808e");
		cardRepository.linking("bwxpg5808e");
		cardRepository.linking("bwxpg5808e");
		//cardRepository.linking("bwxpg5808e");

		System.out.println(cardRepository.total());


	}

}
