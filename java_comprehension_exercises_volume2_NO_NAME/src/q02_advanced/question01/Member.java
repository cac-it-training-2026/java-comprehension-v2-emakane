package q02_advanced.question01;

import java.util.List;

public class Member {
	private int id;
	private String passwordString;
	private String name;
	private int age;
	private int rank;
	private List<Coupon> coupons;

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return passwordString
	 */
	public String getPasswordString() {
		return passwordString;
	}

	/**
	 * @param passwordString セットする passwordString
	 */
	public void setPasswordString(String passwordString) {
		this.passwordString = passwordString;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * @return coupons
	 */
	public List<Coupon> getCoupons() {
		return coupons;
	}

	/**
	 * @param coupons セットする coupons
	 */
	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	/**
	 * 
	 */
	public Member() {
	}

	/**
	 * @param id
	 * @param passwordString
	 * @param name
	 * @param age
	 * @param rank
	 * @param coupons
	 */
	public Member(int id, String passwordString, String name, int age, int rank, List<Coupon> coupons) {
		this.id = id;
		this.passwordString = passwordString;
		this.name = name;
		this.age = age;
		this.rank = rank;
		this.coupons = coupons;
	}

}
