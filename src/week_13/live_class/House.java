package week_13.live_class;

import java.util.Date;
import java.util.Objects;

public class House implements Cloneable,Comparable<House>{
    private int id;
    private double area;
    private Date whenBuilt;

    public House(int id,double area){
        this.id = id;
        this.area = area;
        whenBuilt = new Date();
    }
    public int getId(){
        return this.id;
    }
    public double getArea(){
        return this.area;
    }
    public Date getWhenBuilt(){
        return this.whenBuilt;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    @Override
    public int compareTo(House o){
        if(this.area > o.getArea()){
            return 1;
        }if (this.area == o.getArea()){
            return 0;
        }else {
            return -1;
        }
    }
}
