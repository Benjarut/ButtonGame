package buttongame;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.lwjgl.input.Mouse;


public class ButtonGame extends BasicGame{
	private static int GAME_WIDTH=1000;
	private static int GAME_HEIGHT=800;
	public Image background;
	private Image startButton;
	private Image logo;
	public Input input;
	int xpos,ypos;
	//private String position="";
	
	public ButtonGame(String title) {
		super(title);
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		background.draw(0,0, GAME_WIDTH,GAME_HEIGHT);
		startButton.draw(424,600);
		logo.draw(275,200,500,150);
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		background=new Image("res/colorful-triangles-background.jpg");
		startButton=new Image("res/startButton.png");
		logo =new Image("res/logo.png");
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
//		xpos=Mouse.getX();
//		ypos=Mouse.getY();
		
		//input.isMouseButtonDown(button);
		
	}
	public static void main(String[] args){
		try {
		      ButtonGame game = new ButtonGame("Button Game");
		      AppGameContainer container = new AppGameContainer(game);
		      container.setDisplayMode(GAME_WIDTH, GAME_HEIGHT, false);
		      //container.setMinimumLogicUpdateInterval(1000/60);
		      container.start();
		 } catch (SlickException e) {
		      e.printStackTrace();
		 }
	}
	
	
}
