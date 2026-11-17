package com.shallowvsdeep;

public class TestDeepCopyDemo {

	static class Employee {

		int eid;
		String ename;
		Address1 address1;

		Employee(Employee emp) {
			this.eid = emp.eid;
			this.ename = emp.ename;
			this.address1 = new Address1(emp.address1);
		}

		public Employee(int eid, String ename, Address1 address1) {
			super();
			this.eid = eid;
			this.ename = ename;
			this.address1 = address1;
		}

		void employeeInfo() {
			System.out.println("Employee ID:" + eid);
			System.out.println("Employee Name:" + ename);
			System.out.println("Employee Address:" + address1.city);
			System.out.println("******************");
		}
	}

	static class Address1 {
		String city;

		public Address1(String city) {
			super();
			this.city = city;
		}

		Address1(Address1 address) {
			this.city = address.city;

		}

	}

	public static void main(String[] args) {
		System.out.println("main method Starteed");

		Address1 add = new Address1("vijayawada");
		Employee emp1 = new Employee(1, "manju", add);
		emp1.employeeInfo();

		Employee emp2 = new Employee(emp1);
		emp2.employeeInfo();

		emp2.eid = 2;
		emp2.ename = "manju";
		emp2.address1.city = "Guntur";
		emp2.employeeInfo();
		emp1.employeeInfo();
	}
}
