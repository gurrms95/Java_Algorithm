//package java_stand;
//
//import java.util.*;
//
//public class MyVector2 extends MyVetor implements Iterator{
//	int cursor = 0;
//	int lastRet = -1;
//	
//	public MyVector2(int capacity) {
//		super(capacity);
//	}
//	public MyVector2() {
//		this(10);
//	}
//	public String toString() {
//		String tmp = "";
//		Iterator it = iterator();
//		
//		for(int i=0;it.hasNext();i++) {
//			if(i!=0) tmp+=", ";
//			tmp +=it.next();
//		}
//		return "["+tmp+"]";
//	}
//	public Iterator iterator() {
//		cursor=0;
//		lastRet=-1;
//		return this;
//	}
//	public boolean hasNext() {
//		return cursor !=size();
//	}
//	public Objext next() {
//		Objext next = get(cursor);
//		lastRet = cursor++;
//		return next;
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
