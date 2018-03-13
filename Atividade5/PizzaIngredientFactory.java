package Atividade5;

public interface PizzaIngredientFactory {

	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Veggies createVeggies();
	Pepperoni createPepperoni();
	Clams createClams();
	Dough createDough(DoughEnum dough);
	Sauce createSauce(SauceEnum sauceEnum);
	Cheese createCheese(CheeseEnum cheeseEnum);
	Clams createClams(ClamsEnum clamsEnum);
}
