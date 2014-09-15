package buttongame;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class ButtonGame extends BasicGame{
	private static int GAME_WIDTH=1000;
	private static int GAME_HEIGHT=800;
	public Image background;
	//private String position="";
	
	public ButtonGame(String title) {
		super(title);
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		background.draw(0,0, GAME_WIDTH,GAME_HEIGHT);
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		background=new Image("res/colorful-triangles-background.jpg");
		
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		
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
