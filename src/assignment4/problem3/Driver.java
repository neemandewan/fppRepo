package assignment4.problem3;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figure[] figures = new Figure[5];
		figures[0] = new UpwardHat();
		figures[1] = new UpwardHat();
		figures[2] = new DownwardHat();
		figures[3] = new FaceMaker();
		figures[4] = new Vertical();
		
		showFigure(figures);
	}
	
	public static void showFigure(Figure[] figs) {
		for(Figure fig: figs) {
			fig.getFigure();
		}
		
		String str;
		System.out.println("\n\nIndividual Output:");
		for(Figure fig: figs) {
			str = fig.getClass().getSimpleName();
			System.out.print('\n' + str + ":");
			fig.getFigure();
		}
	}

}
