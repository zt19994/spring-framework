package com.zt1994;

/**
 * 订单类
 *
 * @author zhongtao
 * @date 2022/5/2 22:23
 */
public class Order {

	/**
	 * 订单名称
	 */
	private String orderName;

	/**
	 * 地址
	 */
	private String address;

	public Order(String orderName, String address) {
		this.orderName = orderName;
		this.address = address;
	}

	public void addOrder() {
		System.out.println("orderName: " + orderName + ", address: " + address);
	}
}
