package com.capg.dnd.updatermstock.service;

import java.util.List;

import com.capg.dnd.updatermstock.model.RawMaterialStock;

public interface IUpdateRMStockService {

	public RawMaterialStock addRawMaterialStock(RawMaterialStock stock);
	public boolean deleteRawMaterialStock(long orderId);
	public RawMaterialStock getRawMaterialStockDetails(long orderId);
	public List<RawMaterialStock> getAllRawMaterialStockDetails();
	public RawMaterialStock updateRawMaterialStock(RawMaterialStock newstock) ;
	
	}
