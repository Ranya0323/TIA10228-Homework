package hw8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Train implements Comparable <Train>{
	
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void setStart(String start) {
		this.start = start;
	}
	
	public String getStart() {
		return start;
	}
	
	public void setDest(String dest) {
		this.dest = dest;
	}
	
	public String getDest() {
		return dest;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void display() {
		System.out.printf("班次 = %d 車種 = %s 出發地 = %s 目的地 = %s 票價 = %.1f \n", number,type,start,dest,price);
	}
	
	public Train() {
		
	}
	
	public Train(int number, String type, String start, String dest, double price) {
        this.number = number;
        this.type = type;
        this.start = start;
        this.dest = dest;
        this.price = price;
    }
	
	public int compareTo(Train tTrain) {
        if (this.number > tTrain.number) {
        	return 1;
        }
        else if (this.number == tTrain.number) {
        	return 0;
        }
        else {
        	return -1;
        }
    }
	
	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}

	public static void main(String[] args) {
		Set <Train> t = new TreeSet <>();
		t.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		t.add(new Train(1254, "區間", "屏東", "基隆", 700));
		t.add(new Train(118, "自強", "高雄", "台北", 500));
		t.add(new Train(1288, "區間", "新竹", "基隆", 400));
		t.add(new Train(122, "自強", "台中", "花蓮", 600));
		t.add(new Train(1222, "區間", "樹林", "七堵", 300));
		t.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		// 發現TreeSet 不能用For迴圈做 所以用List特別幫For迴圈做這題
		List <Train> f = new ArrayList<>();
		f.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		f.add(new Train(1254, "區間", "屏東", "基隆", 700));
		f.add(new Train(118, "自強", "高雄", "台北", 500));
		f.add(new Train(1288, "區間", "新竹", "基隆", 400));
		f.add(new Train(122, "自強", "台中", "花蓮", 600));
		f.add(new Train(1222, "區間", "樹林", "七堵", 300));
		f.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		for(int i = 0; i < f.size(); i++) {
			f.get(i).display();;
		}
		
		System.out.println("-----------------------------");
		
		Iterator<Train> objs = t.iterator();
		while (objs.hasNext()) {
			Train train = objs.next();
			train.display();
		}
		
		System.out.println("-----------------------------");
		
		for(Train show : t) {
			show.display();
		}
	}
}
