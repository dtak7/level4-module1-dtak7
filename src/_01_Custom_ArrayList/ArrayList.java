package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	private T[] arr;

	public ArrayList() {
		arr = (T[]) new Object[0];
	}

	public T get(int loc) throws IndexOutOfBoundsException {
		return arr[loc];
	}

	public void add(T val) {
		T[] newArr = (T[]) new Object[arr.length + 1];
		newArr[newArr.length - 1] = val;
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		arr = newArr;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] insrtArr = (T[]) new Object[arr.length + 1];
		for (int i = 0; i < insrtArr.length; i++) {
			if (i < loc) {
				insrtArr[i] = arr[i];
			} else if (i > loc) {
				insrtArr[i] = arr[i - 1];
			} else {
				insrtArr[i] = val;
			}
		}
		arr=insrtArr;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		arr[loc] = val;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] rmveArr = (T[]) new  Object[arr.length-1];
		for(int i =0; i<arr.length;i++) {
			if(i<loc) {
				rmveArr[i] = arr[i];
			}
			else if(i>loc) {
				rmveArr[i-1] = arr[i];
			}
			else {
				continue; 
			}
		}
		arr = rmveArr; 
	}

	public boolean contains(T val) {
		for(int i =0; i<arr.length;i++) {
			if(arr[i].equals(val)) {
				return true; 
			}
		}
		return false;
	}

	public int size() {
		return arr.length;
	}
}