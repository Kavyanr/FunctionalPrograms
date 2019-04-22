package com.bridgelabs.companyshare.model;

import java.util.List;

import com.bridgelabs.functionalutil.CustomLinkedList;

public class CompanyShare {

	private String comapanyName;
	private Long numberOfShares;
	private List<CompanyShare> list;

	public List<CompanyShare> getList() {
		return list;
	}

	@SuppressWarnings("unchecked")
	public void setList(CustomLinkedList linkedList) {
		this.list = (List<CompanyShare>) linkedList;
	}

	public String getComapanyName() {
		return comapanyName;
	}

	public String setComapanyName(String comapanyName) {
		return this.comapanyName = comapanyName;
	}

	public Long getNoOfShare() {
		return numberOfShares;
	}

	public Long setNoOfShare(Long noOfShare2) {
		return this.numberOfShares = noOfShare2;
	}

	@Override
	public String toString() {
		return "name  : " + comapanyName + "\n" + "number of share: " + numberOfShares + "\n";
	}
	
}
