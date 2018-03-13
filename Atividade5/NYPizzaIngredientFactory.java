package Atividade5;

public abstract class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough(DoughEnum doughEnum) {
		Dough dough = null; 
		switch (doughEnum) {
		case THICKCRUST:
			dough = new ThickCrustDough();
			break;
		case THINCRUST:
			dough = new ThinCrustDough();
			break;
		}
		return dough;
	}

	public Sauce createSauce(SauceEnum sauceEnum) {
		Sauce sauce = null; 
		switch (sauceEnum) {
		case PLUMTOMATO:
			sauce = new PlumTomatoSauce();
			break;
		case MARINARA:
			sauce = new MarinaraSauce();
			break;
		}
		return sauce;
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies createVeggies() {
		return new Veggies();
	}

	public Pepperoni createPepperoni() {
		return new Pepperoni();
	}

	public Clams createClams() {
		return null;
	}
}
