package com.dovePayroll.Models;

import java.util.ArrayList;

import com.dovePayroll.DoveTypes.TaxRegion;

public class TaxRegion_Model extends DBConnect {
	private int[] addTaxRegion(TaxRegion region) {
		return null; // return the regionId and status
	}
	
	private int updateTaxRegion(TaxRegion region) {
		return 1; // return an integer value representing the status of the update
	}
	
	private int deleteTaxRegion(int regionID) {
		return 1; // return an integer value representing the deletion status
	}
	
	private TaxRegion getTaxRegion(int regionID) {
		return null; // return the tax region object
	}
	
	public static ArrayList<TaxRegion> getAllTaxRegion(){
		return null; // return an array list of TaxRegion objects
	}
}
