package com.studentmarks;

public class studentBean 
{
	private int stdid;
	private String stdname;
	private int fee;
	private int sub1;
	private int sub2;
	private int sub3;
	
	public studentBean() {
		
	}
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	@Override
	public String toString() {
		return "studentBean [stdid=" + stdid + ", stdname=" + stdname + ", fee=" + fee + ", sub1=" + sub1 + ", sub2="
				+ sub2 + ", sub3=" + sub3 + "]";
	}
	public void Print()
	{
		System.out.println("stdid"+stdid);
		System.out.println("stdname"+stdname);
		System.out.println("stdfee"+fee);
		System.out.println("sub1"+sub1);
		System.out.println("sub2"+sub2);
		System.out.println("sub3"+sub3);
		double total=sub1+sub2+sub3;
		System.out.println("total"+total);
		double avg=total/3;
		System.out.println("avg"+avg);
		if(avg>70)
		{
			System.out.println("A Grade");
		}
		if(avg>60 &&avg<70)
		{
			System.out.println("B Grade");
		}
		else 
		{
			System.out.println("c Grade");
		}
	}

}
