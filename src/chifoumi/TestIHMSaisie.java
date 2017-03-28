package chifoumi;

public class TestIHMSaisie {

	public static void main(String[] args) {
		IHMSaisie saisie = new IHMSaisie("Philippe");
		Choix choix = saisie.proposerChoix();
		System.out.println("Le choix de Philippe est "+ choix);

	}

}
