package dmacc.beans;

import java.util.Random;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;
	
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayerToRandom();
		this.determineWinner();
	}	
	
	private void setComputerPlayerToRandom() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int randomChoice = rand.nextInt(3);
		
		if(randomChoice == 0) {
			computerPlayer = "rock";
		}
		else if(randomChoice == 1) {
			computerPlayer = "paper";
		}
		else if(randomChoice == 2) {
			computerPlayer = "scissors";
		}
		
	}
	
	private void determineWinner() {
		// TODO Auto-generated method stub
		if (player1.equals(computerPlayer)) {
			winner = "tie";
		}
		else if(player1.equals("rock")) {
			if (computerPlayer.equals("paper")) {
				winner = computerPlayer;
			}
			else if(computerPlayer.equals("scissors")) {
				winner = player1;
			}
						
		}
		
		else if(player1.equals("paper")) {
			if (computerPlayer.equals("scissors")) {
				winner = computerPlayer;
			}
			else if(computerPlayer.equals("rock")) {
				winner = player1;
			}
			
			
		}
		
		else if(player1.equals("scissors")) {
			if (computerPlayer.equals("rock")) {
				winner = computerPlayer;
			}
			else if(computerPlayer.equals("paper")) {
				winner = player1;
			}
			
			
		}
		
	}


	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getPlayer1() {
		return player1;
	}


	public void setPlayer1(String player1) {
		this.player1 = player1;
	}


	public String getComputerPlayer() {
		return computerPlayer;
	}


	public void setComputerPlayer(String computerPlayer) {
		this.computerPlayer = computerPlayer;
	}


	public String getWinner() {
		return winner;
	}


	public void setWinner(String winner) {
		this.winner = winner;
	}


	@Override
	public String toString() {
		return "Game [player1=" + player1 + ", computerPlayer=" + computerPlayer + ", winner=" + winner + "]";
	}
	
	
	

}

