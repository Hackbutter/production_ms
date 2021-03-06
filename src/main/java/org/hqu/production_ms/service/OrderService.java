package org.hqu.production_ms.service;

import java.util.List;

import org.hqu.production_ms.domain.COrder;
import org.hqu.production_ms.domain.custom.CustomResult;
import org.hqu.production_ms.domain.custom.EUDataGridResult;
import org.hqu.production_ms.domain.po.COrderPO;

public interface OrderService {
	
	List<COrder> find() throws Exception; 
	
	EUDataGridResult getList(int page, int rows, COrder cOrder) throws Exception;
	
	COrder get(String string) throws Exception;
	
	CustomResult delete(String string) throws Exception;

	CustomResult deleteBatch(String[] ids) throws Exception;

	CustomResult insert(COrderPO cOrder) throws Exception;

	//更新部分字段，用的是updateSelective判断非空的字段进行更新
    CustomResult update(COrderPO cOrder) throws Exception;
    
    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(COrderPO cOrder) throws Exception;
    
    CustomResult updateNote(COrderPO cOrder) throws Exception;

    CustomResult changeStatus(String[] ids) throws Exception;

    //根据订单id查找订单信息
    EUDataGridResult searchOrderByOrderId(int page, int rows, String orderId) throws Exception;
	
    //根据客户名称查找订单信息
	EUDataGridResult searchOrderByCustomName(int page, int rows,
			String customName) throws Exception;
	
	//根据产品名称查找订单信息
	EUDataGridResult searchOrderByProductName(int page, int rows,
			String productName) throws Exception;
}
