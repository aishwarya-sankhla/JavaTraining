package com.training;

public abstract class Item {
	private String itemName;
	private float itemPrice;
	private int quantity;
	private int duration;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Item(String itemName, float itemPrice, int quantity, int duration) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
		this.duration = duration;
	}

	public Item(String itemName, float itemPrice, int quantity) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
	}
	
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public  String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + duration;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (duration != other.duration)
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		return true;
	}


	
}
