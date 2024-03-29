package ListeSinifi;


public class MyList <T>{
	
	
	private int capacity;


	T[] list;
	T[] listCopy;
	
	public MyList() {
		super();
		this.capacity = 10;
		this.list = (T[]) new Object[this.capacity];
		this.listCopy = (T[]) new Object[this.capacity];

	
	}
	
	public MyList(int capacity) {
		this.capacity = capacity;
		this.list = (T[]) new Object[this.capacity];
		this.listCopy = (T[]) new Object[this.capacity];
	}
	
	//---ekleme
	int count = 0;
	
	public boolean add(T data) {
		int i =0,j=0,k=this.capacity;
		if(count == this.capacity) {
			this.capacity *=2;
			while(true) {
				listCopy[i] = list[i];
				i++;
				if(i == k) {
					break;
				}
			}
			
			this.list = (T[]) new Object[this.capacity]; 
			while(true) {
				list[j] = listCopy[j];
				j++;
				if(j == k) {
					break;
				}
			}
			this.listCopy = (T[]) new Object[this.capacity];
		}
		add(data,count);
		count++;
		
		return true;
		
	}
	private void add(T data,int count) {
		list[count] = data;
	}
	
	//---index döndürme
	public T get(int value) {
		int size = size();
		T i = list[value];
		if(value<0 || value >=size) {
			return null;
		}
		return i;
		
	}
	//--verilen indexe değer atama
	public void set(int index,T value) {
		
		list[index] = value;
		//return list;
	}
	//--uzunluk
	public int size() {
		int size=0;
		for(Object l : list) {
			if(l != null) {
				size++;
			}
		}
		return size;
	}
	//--kaldırma
	public void remove(int value) {
		int size = size();
		
		for(int i = value ; i<size;i++) {
			list[value] = list[value+1];	
		}
		count--;
		
	}
	//--yazdırma
	public String toString() {
		int size = size();
		String str = "";
		str+="[";
		for(int  i = 0 ; i <size ; i++) {
			if(list[i] != null) {
				if(list[i+1] == null) {
					str = str+list[i];
				}else {
					str = str+list[i]+",";
				}
			}	
		}
		str+="]";
		return str;
	}
	
	//boş mu
	public boolean isEmpty() {
		int size = size();
		if(size == 0) {
			return true;
		}
		return false;
	}
	
	//ilk index bulma
	public int indexOf(Object value) {
		int size = size();
		for(int i = 0 ; i<size ; i++) {
			if(list[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	//son index bulma
	public int lastIndexOf(Object value) {
		int size = size();
		for(int i = size ; i>=0 ; i--) {
			if(list[i] == value) {
				return i;
			}
		}
		return -1;
	}
	
	//yeni dizi
	public T[] toArray() {
		int size = size();
		T[] dizi = (T[]) new Object[size];
		for(int i = 0 ; i<size ; i++) {
			dizi[i] = list[i];
		}
		return dizi;
	}
	
	//alt liste
	public MyList<T> subList(int start,int finish) {
		MyList<T> liste = new MyList<T>();
		
		for(int i = start , j=0; i<=finish;i++,j++) {
			
			liste.add((T) list[i]);
		}
		return liste;
	}
	
	
	//içeriyor mu
	public boolean contains(T value) {
		for(int i = 0 ; i<size();i++) {
			if(list[i] == value) {
				return true;
			}
		}
		return false;
	}
	
	//--temizleme
	public void clear() {
		this.list = (T[]) new Object[0];
		
		for(int i = 0 ; i<size();i++) {
			System.out.print(list[i]);
		}
		
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
