package Model;

public class Model {

	private int playerX = 450;
	private int playerY = 400;
	private int step = 10;
	private boolean jump = false;
	private int jumpCount = 12;
	private int gravityCount = 0;
	private boolean upKey = false;
	private boolean leftKey = false;
	private boolean downKey = false;
	private boolean rightKey = false;
	
	public int getPlayerY() {
		return playerY;
	}
	
	public void setPlayerY(int playerY) {
		this.playerY = playerY;
	}
	
	public int getPlayerX() {
		return playerX;
	}
	
	public void setPlayerX(int playerX) {
		this.playerX = playerX;
	}
	
	/*-----Movement-------*/
	
	public void moveUp() {
		setPlayerY(getPlayerY() - step);
	}
	
	public void moveLeft() {
		setPlayerX(getPlayerX() - step);
	}
	
	public void moveDown() {
		setPlayerY(getPlayerY() + step);		
	}
	
	public void moveRight() {
		setPlayerX(getPlayerX() + step);
	}

	/*--------------*/
	
	public void jump() {
		setPlayerY(getPlayerY() - 3*jumpCount);
	}
	
	public void gravity() {
		setPlayerY(getPlayerY() + jumpCount);
	}
	
	/*--*/
	
	public boolean isJump() {
		return jump;
	}

	public void setJump(boolean jump) {
		this.jump = jump;
	}

	/*--*/
	
	public int getJumpCount() {
		return jumpCount;
	}

	public void setJumpCount(int jumpCount) {
		this.jumpCount = jumpCount;
	}

	public int getGravityCount() {
		return gravityCount;
	}

	public void setGravityCount(int gravityCount) {
		this.gravityCount = gravityCount;
	}

	/*--*/

	public boolean isUpKey() {
		return upKey;
	}

	public void setUpKey(boolean upKey) {
		this.upKey = upKey;
	}

	public boolean isLeftKey() {
		return leftKey;
	}

	public void setLeftKey(boolean leftKey) {
		this.leftKey = leftKey;
	}

	public boolean isRightKey() {
		return rightKey;
	}

	public void setRightKey(boolean rightKey) {
		this.rightKey = rightKey;
	}

	public boolean isDownKey() {
		return downKey;
	}

	public void setDownKey(boolean downKey) {
		this.downKey = downKey;
	}

	
}
