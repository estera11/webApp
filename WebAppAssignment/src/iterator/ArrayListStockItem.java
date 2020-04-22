package iterator;
import java.util.ArrayList;

import model.StockItem;

public class ArrayListStockItem implements Collection {
		int count = 0;
		ArrayList<StockItem> itemsList;

		public ArrayListStockItem() {
			itemsList = new ArrayList<StockItem>();
		}

		public void addItem(StockItem item) {
			itemsList.add(item);
		}

		@Override
		public Iterator getIterator() {
			return new ArrayListIterator();
		}

		public class ArrayListIterator implements Iterator {

			@Override
			public Object first() {
				return itemsList.get(0);
			}

			@Override
			public boolean hasNext() {
			
				return itemsList.get(count++)!=null;
			}

			@Override
			public Object next() {
				if (this.hasNext()) {
					return itemsList.get(count++);
				}
				return null;
			}

			@Override
			public Object previous() {
				System.out.println(count);
				if (count != 0) {
					//System.out.println(itemsList.get(count--).getId());
					return itemsList.get(count--);
				}
				return null;
			}

			@Override
			public Object last() {
				return itemsList.get(itemsList.size() - 1);
			}

		}

	}

