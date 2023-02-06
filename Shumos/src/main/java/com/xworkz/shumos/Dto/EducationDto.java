package com.xworkz.shumos.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor


public class EducationDto {
	
	private String primShcool;
	private String highShcool;
	private String puc;
	private String pucField;
	private String degrre;
	private String degreeField;
	private int priMar;
	private int highMar;
	private int pucMar;
	private int degrMar;
	private boolean happy;
	public String getPrimShcool() {
		return primShcool;
	}
	public String getHighShcool() {
		return highShcool;
	}
	public String getPuc() {
		return puc;
	}
	public String getPucField() {
		return pucField;
	}
	public String getDegrre() {
		return degrre;
	}
	public String getDegreeField() {
		return degreeField;
	}
	public int getPriMar() {
		return priMar;
	}
	public int getHighMar() {
		return highMar;
	}
	public int getPucMar() {
		return pucMar;
	}
	public int getDegrMar() {
		return degrMar;
	}
	public boolean isHappy() {
		return happy;
	}
	public void setPrimShcool(String primShcool) {
		this.primShcool = primShcool;
	}
	public void setHighShcool(String highShcool) {
		this.highShcool = highShcool;
	}
	public void setPuc(String puc) {
		this.puc = puc;
	}
	public void setPucField(String pucField) {
		this.pucField = pucField;
	}
	public void setDegrre(String degrre) {
		this.degrre = degrre;
	}
	public void setDegreeField(String degreeField) {
		this.degreeField = degreeField;
	}
	public void setPriMar(int priMar) {
		this.priMar = priMar;
	}
	public void setHighMar(int highMar) {
		this.highMar = highMar;
	}
	public void setPucMar(int pucMar) {
		this.pucMar = pucMar;
	}
	public void setDegrMar(int degrMar) {
		this.degrMar = degrMar;
	}
	public void setHappy(boolean happy) {
		this.happy = happy;
	}
	
	
	
	
}
