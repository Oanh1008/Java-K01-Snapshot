package bean;

import java.util.Objects;

public class Item {

	private Integer itemId;
	
	private String itemName;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(Integer itemId, String itemName) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(this.itemId,this.itemName);
	}
	
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if (this == o) return true;
		
		if (!(o instanceof Item)) return false;
		
		Item that = (Item)o;
		
		return getItemId() == that.getItemId()
			&& getItemName().equals(that.getItemName());
		
	}
}
