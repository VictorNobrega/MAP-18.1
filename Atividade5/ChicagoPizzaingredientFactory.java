package Atividade5;

public abstract class ChicagoPizzaingredientFactory implements PizzaIngredientFactory {


	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese(CheeseEnum cheeseEnum) {
		Cheese cheese = null;
		switch (cheeseEnum) {
		case MOZZARELLA:
			cheese = new MozzarellaCheese();
			break;
		default:
			cheese = new ReggianoCheese();
			break;
		}
		return cheese;
	}

	@Override
	public Veggies createVeggies() {
		return new Veggies();
	}

	@Override
	public Pepperoni createPepperoni() {
		return new Pepperoni();
	}

	@Override
	public Clams createClams(ClamsEnum clamsEnum) {
		Clams clams = null;
		switch (clamsEnum) {
		case FRESH:
			clams = new FreshClams();
			break;
		default:
			clams = new FrozenClams();
			break;
		}
		
		return clams;
	}
}
