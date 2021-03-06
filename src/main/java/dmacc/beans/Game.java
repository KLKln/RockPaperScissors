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
		this.setComputerPlayer();
		this.determineWinner();
	}	
	
	private void setComputerPlayer() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int randomChoice = rand.nextInt(5);
		
		if(randomChoice == 0) {
			computerPlayer = "rock";
		}
		else if(randomChoice == 1) {
			computerPlayer = "paper";
		}
		else if(randomChoice == 2) {
			computerPlayer = "scissors";
		}
		else if(randomChoice == 3) {
			computerPlayer = "lizard";
		}
		else if(randomChoice == 4) {
			computerPlayer = "spock";
		}
		
		return;
		
	}
	
	private void determineWinner() {
		// TODO Auto-generated method stub
		//String winner = "winner";
		if (player1.equals(computerPlayer)) {
			this.setWinner("no one, it's a tie");
		}
		else if(player1.equals("rock")) {
			if (computerPlayer.equals("paper")) {
				this.setWinner(computerPlayer);
			}
			else if(computerPlayer.equals("scissors")) {
				this.setWinner(player1);
			}
			else if(computerPlayer.equals("lizard")) {
				this.setWinner(player1);
			}
			else if(computerPlayer.equals("spock")) {
				this.setWinner(computerPlayer);
			}
			
		}
		
		else if(player1.equals("paper")) {
			if (computerPlayer.equals("scissors")) {
				this.setWinner(computerPlayer);
			}
			else if(computerPlayer.equals("rock")) {
				this.setWinner(player1);
			}
			else if(computerPlayer.equals("lizard")) {
				this.setWinner(computerPlayer);
			}
			else if(computerPlayer.equals("spock")) {
				this.setWinner(player1);
			}
		}
		
		else if(player1.equals("scissors")) {
			if (computerPlayer.equals("rock")) {
				this.setWinner(computerPlayer);
			}
			else if(computerPlayer.equals("paper")) {
				this.setWinner(player1);
			}
			else if(computerPlayer.equals("lizard")) {
				this.setWinner(player1);
			}
			else if(computerPlayer.equals("spock")) {
				this.setWinner(computerPlayer);
			}
			
			
		}
		else if(player1.equals("lizard")) {
			if (computerPlayer.equals("rock")) {
				this.setWinner(computerPlayer);
			}
			else if(computerPlayer.equals("paper")) {
				this.setWinner(player1);
			}
			else if(computerPlayer.equals("scissors")) {
				this.setWinner(computerPlayer);
			}
			else if(computerPlayer.equals("spock")) {
				this.setWinner(player1);
			}
			
		}
		else if(player1.contentEquals("spock")){
			if (computerPlayer.equals("rock")) {
				this.setWinner(player1);
			}
			else if(computerPlayer.equals("paper")) {
				this.setWinner(computerPlayer);
			}
			else if(computerPlayer.equals("scissors")) {
				this.setWinner(player1);
			}
			else if(computerPlayer.equals("lizard")) {
				this.setWinner(computerPlayer);
			}
		}

		return;			
	}

	

	
	
	

	

	

	
	
	

}

