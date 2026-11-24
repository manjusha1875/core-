package com.oopsInheritance;

abstract class FoodOrder {
	abstract void CalculateBill();

	abstract void PreparOrder();
}
	class PizzaOrder extends FoodOrder {

		@Override
		void CalculateBill() {
			int price = 250;
			int quantity = 2;
			System.out.println("Pizza Bill is : " + (price * quantity));
		}

		@Override
		void PreparOrder() {
			System.out.println("Pizza is preparing cheese and bread && waiting pizza is ready");
		}

	}

//child class 2
	class BurgerOrder extends FoodOrder {

		@Override
		void CalculateBill() {
			int price = 50;
			int quantity = 1;
			System.out.println("Burger Bill is :" + (price * quantity));
		}

		@Override
		void PreparOrder() {
			System.out.println("Burger is preparing with bun");
		}

	}

	class BriyaniOrder extends FoodOrder {

		@Override
		void CalculateBill() {
			int price = 150;
			int quantity = 1;
			System.out.println("Briyani Bill is:" + (price * quantity));
		}

		@Override
		void PreparOrder() {
			System.out.println("Briyani is preparing with chicken");
		}

	}

	class FoodOrderSys {

		public static void main(String[] args) {
			FoodOrder Pizza = new PizzaOrder();
			Pizza.CalculateBill();
			Pizza.PreparOrder();

			System.out.println("***************");

			FoodOrder Burger = new BurgerOrder();
			Burger.CalculateBill();
			Burger.PreparOrder();

			System.out.println("***************");
			
			FoodOrder Briyani = new BriyaniOrder();
			Briyani .CalculateBill();
			Briyani .PreparOrder();

			System.out.println("***************");
		}

	}

